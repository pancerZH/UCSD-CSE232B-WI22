package edu.ucsd.cse232b.query;

import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class ReWriter {

    public static String convert(QueryGrammarParser.ForXqContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<Map<String, String>> forList = new ArrayList<>();
        List<Map<Integer, String>> forOrderList = new ArrayList<>();
        for(int i=0; i<ctx.forClause().VAR().size(); i++) {
            // var: $b
            String var = ctx.forClause().VAR(i).getText();
            // xq: $a/../attr
            String xq = ctx.forClause().xq(i).getText();
            // root: $a
            String root = xq.split("/")[0];
            boolean find = false;
            for(int j=0; j<forList.size(); j++) {
                Map<String, String> map  =forList.get(j);
                Map<Integer, String> orderMap = forOrderList.get(j);
                if(map.containsKey(root)) {
                    find = true;
                    map.put(var, xq);
                    orderMap.put(orderMap.size(), var);
                    break;
                }
            }

            if(!find) {
                // new sub for clause found
                Map<String, String> forMap = new HashMap<>();
                forMap.put(var, xq);
                forList.add(forMap);
                Map<Integer, String> orderMap = new HashMap<>();
                orderMap.put(0, var);
                forOrderList.add(orderMap);
            }
        }

        // now we have a list of for clauses
        // then build condition map from it
        List<List<Pair<String, String>>> whereList = new ArrayList<>();
        for(Map<String, String> ignored : forList) {
            whereList.add(new ArrayList<>());
        }
        String[] wheres = ctx.whereClause().cond().getText().split("and");
        for (String where : wheres) {
            // $a = $b -> left=$a, right=$b, no leading or trailing spaces
            String[] xqs = where.split("eq|=");
            String left = xqs[0].strip();
            String right = xqs[1].strip();
            for (int i = 0; i < forList.size(); i++) {
                if (forList.get(i).containsKey(left) || forList.get(i).containsKey(right)) {
                    // a join condition must involve two sub for clause
                    whereList.get(i).add(new Pair<>(left, right));
                }
            }

        }

        // with for list and where list, we can generate rewriter list
        List<ReWriter> reWriterList = new ArrayList<>();
        for(int i=0; i<forList.size(); i++) {
            ReWriter reWriter = ReWriter.generateReWriter();
            reWriter.setForMap(forList.get(i), forOrderList.get(i));
            reWriter.setCondList(whereList.get(i));
            reWriterList.add(reWriter);
        }

        if(reWriterList.isEmpty()) {
            // what happens here?
            return "";
        }

        // select one rewriter from the list, and join with another one
        // this would form a new sub for clause, or a group
        // and continue to join with another one
        // until all joined
        Set<Integer> picked = new HashSet<>();
        picked.add(0);
        Set<String> varSet = new HashSet<>(forList.get(0).keySet());
        sb.append(reWriterList.get(0).convertToString());
        while(picked.size() != forList.size()) {
            int beforeLength = picked.size();
            for(int i=1; i<forList.size(); i++) {
                if(picked.contains(i)) {
                    continue;
                }
                List<String> condLeft = new ArrayList<>();
                List<String> condRight = new ArrayList<>();
                for(Pair<String, String> pair : whereList.get(i)) {
                    String left = pair.a, right = pair.b;
                    if((varSet.contains(left) && forList.get(i).containsKey(right)) ||
                            (varSet.contains(right) && forList.get(i).containsKey(left))) {
                        // this is a match
                        if (varSet.contains(left)) {
                            condLeft.add(left);
                            condRight.add(right);
                        } else {
                            condLeft.add(right);
                            condRight.add(left);
                        }
                    }
                }
                if(!condLeft.isEmpty()) {
                    // so existing sub for clause could join with the ith for clause
                    picked.add(i);
                    varSet.addAll(forList.get(i).keySet());
                    sb.insert(0, "join (");
                    sb.append(reWriterList.get(i).convertToString());
                    sb.append("[");
                    for(String left : condLeft) {
                        sb.append(left.substring(1));  // remove $
                        sb.append(",");
                    }
                    sb.deleteCharAt(sb.length()-1);  // remove last comma
                    sb.append("], ");
                    sb.append("[");
                    for(String right : condRight) {
                        sb.append(right.substring(1));  // remove $
                        sb.append(",");
                    }
                    sb.deleteCharAt(sb.length()-1);  // remove last comma
                    sb.append("]");
                    sb.append("\n");
                    sb.append("),\n");
                }
            }

            if(beforeLength == picked.size()) {
                int index = IntStream.range(0, forList.size()).filter(i -> !picked.contains(i)).findFirst().orElse(-1);
                if(index == -1) {
                    continue;
                }
                // here we get some group(s) that currently has no join conditions
                // empty join (cartesian product)
                picked.add(index);
                varSet.addAll(forList.get(index).keySet());
                sb.insert(0, "join (");
                sb.append(reWriterList.get(index).convertToString());
                sb.append("[], []\n),\n");
            }
        }
        sb.deleteCharAt(sb.length()-2);

        // at very first
        sb.insert(0, "for $tuple in ");

        // process return clause
        String returnText = ctx.returnClause().xq().getText();
        Set<String> returnedVars = new HashSet<>();
        for(int i=0; i<returnText.length(); i++) {
            if(returnText.charAt(i) == '$') {
                for(int j=i+1; j<returnText.length(); j++) {
                    char c = returnText.charAt(j);
                    if(c == ',' || c == '/' || c == ' ' || c == '}') {
                        returnedVars.add(returnText.substring(i, j));
                        i = j;
                        break;
                    }
                }
            }
        }
        for(String var : returnedVars) {
            String newVar = "$tuple/" + var.substring(1) + "/" + "*";
            var = Pattern.quote("$") + var.substring(1);
            returnText = returnText.replaceAll(var, Matcher.quoteReplacement(newVar));
        }
        sb.append("return\n");
        sb.append(returnText);
        return sb.toString();
    }

    // for [var] in [xq]
    // map: var -> xq
    private final Map<String, String> forMap;
    private final Map<Integer, String> forOrderMap;
    // where [xq1] [cond] [xq2]
    // map: <xq1, xq2> -> cond
    private final List<Pair<String, String>> condList;

    public static ReWriter generateReWriter() {
        return new ReWriter();
    }

    private ReWriter() {
        this.forMap = new HashMap<>();
        this.forOrderMap = new HashMap<>();
        this.condList = new ArrayList<>();
    }

    public void setForMap(Map<String, String> map, Map<Integer, String> order) {
        this.forMap.clear();
        this.forMap.putAll(map);
        this.forOrderMap.putAll(order);
    }

    public void setCondList(List<Pair<String, String>> list) {
        this.condList.clear();
        this.condList.addAll(list);
    }

    private String convertForClause() {
        StringBuilder sb = new StringBuilder("for ");
        for(int i=0; i<this.forOrderMap.size(); i++) {
            String var = this.forOrderMap.get(i);
            String xq = this.forMap.get(var);
            sb.append(var);
            sb.append(" ");
            sb.append("in");
            sb.append(" ");
            sb.append(xq);
            sb.append(",\n");
        }
        sb.deleteCharAt(sb.length()-2);  // remove last comma
        return sb.toString();
    }

    private String convertCondClause() {
        // to see whether we can push down any selection
        StringBuilder sb = new StringBuilder("where ");
        boolean pushDown = false;
        for(Pair<String, String> pair : this.condList) {
            String condRoot1 = pair.a.split("/")[0];
            String condRoot2 = pair.b.split("/")[0];
            if((this.forMap.containsKey(condRoot1) && this.forMap.containsKey(condRoot2)) ||
                    (this.forMap.containsKey(condRoot1) && !condRoot2.startsWith("$")) ||
                    (this.forMap.containsKey(condRoot2) && !condRoot1.startsWith("$"))) {
                if(!pushDown) {
                    pushDown = true;
                }
                sb.append(pair.a);
                sb.append(" eq ");
                sb.append(pair.b);
                sb.append(",\n");
            }
        }
        if(pushDown) {
            sb.deleteCharAt(sb.length()-2);  // remove last comma
            return sb.toString();
        } else {
            return "";
        }
    }

    private String convertReturnClause() {
        StringBuilder sb = new StringBuilder("return ");
        sb.append("<tuple>{\n");
        for(int i=0; i<this.forOrderMap.size(); i++) {
            String var = this.forOrderMap.get(i);
            String rawName = var.substring(1);
            sb.append("<").append(rawName).append(">{");
            sb.append(var);
            sb.append("}<").append("/").append(rawName).append(">");
            sb.append(",\n");
        }
        sb.deleteCharAt(sb.length()-2);  // remove last comma
        sb.append("}</tuple>,\n");
        return sb.toString();
    }

    public String convertToString() {
        return this.convertForClause() +
                this.convertCondClause() +
                this.convertReturnClause();
    }

}
