package edu.ucsd.cse232b.query;

import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.Map;

public class ReWriter {

    // for [var] in [xq]
    // map: var -> xq
    private final Map<String, String> forMap;
    // where [xq1] [cond] [xq2]
    // map: <xq1, xq2> -> cond
    private final Map<Pair<String, String>, String> condMap;

    public ReWriter() {
        this.forMap = new HashMap<>();
        this.condMap = new HashMap<>();
    }

    public void setForMap(Map<String, String> map) {
        this.forMap.clear();
        this.forMap.putAll(map);
    }

    public void setCondMap(Map<Pair<String, String>, String> map) {
        this.condMap.clear();
        this.condMap.putAll(map);
    }

    private String convertForClause() {
        StringBuilder sb = new StringBuilder("for ");
        for(Map.Entry<String, String> entry : this.forMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" ");
            sb.append("in");
            sb.append(" ");
            sb.append(entry.getValue());
            sb.append(",\n");
        }
        sb.deleteCharAt(sb.length()-2);  // remove last comma
        return sb.toString();
    }

    private String convertCondClause() {
        // to see whether we can push down any selection
        StringBuilder sb = new StringBuilder("where ");
        boolean pushDown = false;
        for(Map.Entry<Pair<String, String>, String> entry : this.condMap.entrySet()) {
            String condRoot1 = entry.getKey().a.split("/")[0];
            String condRoot2 = entry.getKey().b.split("/")[0];
            if((this.forMap.containsKey(condRoot1) && this.forMap.containsKey(condRoot2)) ||
                    (this.forMap.containsKey(condRoot1) && !condRoot2.startsWith("$")) ||
                    (this.forMap.containsKey(condRoot2) && !condRoot1.startsWith("$"))) {
                if(!pushDown) {
                    pushDown = true;
                }
                sb.append(entry.getKey().a);
                sb.append(" ");
                sb.append(entry.getValue());
                sb.append(" ");
                sb.append(entry.getKey().b);
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
        for(String var : this.forMap.keySet()) {
            String rawName = var.substring(1);
            sb.append("<").append(rawName).append(">{");
            sb.append(var);
            sb.append("}<").append("\\").append(rawName).append(">");
            sb.append(",\n");
        }
        sb.deleteCharAt(sb.length()-2);  // remove last comma
        sb.append("}<\\tuple>,\n");
        return sb.toString();
    }

    public String convertToString() {
        return this.convertForClause() +
                this.convertCondClause() +
                this.convertReturnClause();
    }

}
