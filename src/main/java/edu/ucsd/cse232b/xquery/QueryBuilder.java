package edu.ucsd.cse232b.xquery;

import edu.ucsd.cse232b.expression.Expression;
import edu.ucsd.cse232b.parsers.QueryGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import edu.ucsd.cse232b.query.*;
import edu.ucsd.cse232b.xpath.ExpressionBuilder;
import edu.ucsd.cse232b.xpath.Xpath;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class QueryBuilder extends QueryGrammarBaseVisitor<Query> {

    private Map<String, List<Node>> contextMap;
    private final Stack<Map<String, List<Node>>> contextStack;
    private final Xpath xpath;
    private final ExpressionBuilder expBuilder;
    private final Document doc;

    public QueryBuilder(Document doc) throws Exception {
        Objects.requireNonNull(doc, "Document is NULL!");
        this.doc = doc;
        this.contextMap = new HashMap<>();  // current context
        this.contextStack = new Stack<>();  // for variable scope
        this.xpath = new Xpath();
        this.expBuilder = new ExpressionBuilder();
    }

    @Override public Query visitJoinXq(QueryGrammarParser.JoinXqContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Query visitJoin1(QueryGrammarParser.Join1Context ctx) {
        Query left = visit(ctx.xq(0));
        Query right = visit(ctx.xq(1));
        List<String> leftAtt = new ArrayList<>();
        for (int i = 0; i < ctx.constantList(0).ID().size(); i ++) {
            leftAtt.add(ctx.constantList(0).ID(i).getText());
        }
        List<String> rightAtt = new ArrayList<>();
        for (int i = 0; i < ctx.constantList(1).ID().size(); i ++) {
            rightAtt.add(ctx.constantList(1).ID(i).getText());
        }
        return new Join(left, right, leftAtt, rightAtt);
    }

    @Override public Query visitJoin2(QueryGrammarParser.Join2Context ctx) {
        Query left = visit(ctx.joinClause());
        Query right = visit(ctx.xq());
        List<String> leftAtt = new ArrayList<>();
        for (int i = 0; i < ctx.constantList(0).ID().size(); i ++) {
            leftAtt.add(ctx.constantList(0).ID(i).getText());
        }
        List<String> rightAtt = new ArrayList<>();
        for (int i = 0; i < ctx.constantList(1).ID().size(); i ++) {
            rightAtt.add(ctx.constantList(1).ID(i).getText());
        }
        return new Join(left, right, leftAtt, rightAtt);
    }

    @Override public Query visitJoin3(QueryGrammarParser.Join3Context ctx) {
        Query left = visit(ctx.xq());
        Query right = visit(ctx.joinClause());
        List<String> leftAtt = new ArrayList<>();
        for (int i = 0; i < ctx.constantList(0).ID().size(); i ++) {
            leftAtt.add(ctx.constantList(0).ID(i).getText());
        }
        List<String> rightAtt = new ArrayList<>();
        for (int i = 0; i < ctx.constantList(1).ID().size(); i ++) {
            rightAtt.add(ctx.constantList(1).ID(i).getText());
        }
        return new Join(left, right, leftAtt, rightAtt);
    }

    @Override public Query visitRpXq(QueryGrammarParser.RpXqContext ctx) {
        Query query = visit(ctx.xq());
        Expression exp = this.expBuilder.visit(xpath.parse(ctx.rp().getText()).rp());
        Query.PathOp op = Query.opFromString(ctx.pathOp().getText());
        return new RpXq(query, op, exp);
    }
    
    @Override public Query visitStringXq(QueryGrammarParser.StringXqContext ctx) {
        String stringConst = ctx.STRING().getText();
        return new StringXq(stringConst.substring(1, stringConst.length()-1));
    }

    @Override public Query visitParaXq(QueryGrammarParser.ParaXqContext ctx) {
        Query query = visit(ctx.xq());
        return new ParaXq(query);
    }

    @Override public Query visitApXq(QueryGrammarParser.ApXqContext ctx) {
        List<Node> list = null;
        try {
            list = this.xpath.evaluate(ctx.ap().getText());
        } catch (Exception e) {
            list = List.of();
            e.printStackTrace();
        }
        return new ApXq(list);
    }

    @Override public Query visitBinaryXq(QueryGrammarParser.BinaryXqContext ctx) {
        Query query1 = visit(ctx.xq(0));
        Query query2 = visit(ctx.xq(1));
        return new BinaryXq(query1, query2);
    }

    @Override public Query visitVarXq(QueryGrammarParser.VarXqContext ctx) {
        return new VarXq(this.contextMap.get(ctx.VAR().getText()));
    }

    @Override public Query visitLetXq(QueryGrammarParser.LetXqContext ctx) {
        this.constructClause(ctx.letClause().VAR(), ctx.letClause().xq());
        Query query = visit(ctx.xq());
        this.deconstructClause(ctx.letClause().VAR().size());
        return query;
    }

    private void forXq(int count, List<Node> res, QueryGrammarParser.ForXqContext ctx) throws Exception {
        int size = ctx.forClause().VAR().size();
        if(count == size) {
            // should execute where
            if(null != ctx.letClause()) {
                this.constructClause(ctx.letClause().VAR(), ctx.letClause().xq());
            }
            if(null == ctx.whereClause() || (null != ctx.whereClause() && null != visit(ctx.whereClause().cond()).evaluate(this.doc))) {
                res.addAll(visit(ctx.returnClause().xq()).evaluate(this.doc));
            }
            if(null != ctx.letClause()) {
                this.deconstructClause(ctx.letClause().VAR().size());
            }
        } else {
            String varName = ctx.forClause().VAR(count).getText();
            List<Node> nodeList = visit(ctx.forClause().xq(count)).evaluate(this.doc);
            for(Node node : nodeList) {
                Map<String, List<Node>> oldMap = new HashMap<>(this.contextMap);
                this.contextStack.push(oldMap);
                this.contextMap.put(varName, List.of(node));
                this.forXq(count+1, res, ctx);
                this.contextMap = this.contextStack.pop();
            }
        }
    }

    @Override public Query visitForXq(QueryGrammarParser.ForXqContext ctx) {
        List<Node> res = new ArrayList<>();
        try {
            this.forXq(0, res, ctx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // use VarXq as a simple solution
        return new VarXq(res);
    }

    @Override public Query visitTagXq(QueryGrammarParser.TagXqContext ctx) {
        String tagName = ctx.startTag().tagName().getText();
        Query query = visit(ctx.xq());
        return new TagXq(tagName, query);
    }

    @Override public Query visitForClause(QueryGrammarParser.ForClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitLetClause(QueryGrammarParser.LetClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitWhereClause(QueryGrammarParser.WhereClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitReturnClause(QueryGrammarParser.ReturnClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitEqCond2(QueryGrammarParser.EqCond2Context ctx) {
        Query q1 = visit(ctx.xq(0));
        Query q2 = visit(ctx.xq(1));
        return new EqCond(q1, q2);
    }

    @Override public Query visitCompoundCond(QueryGrammarParser.CompoundCondContext ctx) {
        Query c1 = visit(ctx.cond(0));
        Query c2 = visit(ctx.cond(1));
        String conj = ctx.CONJ().getText();
        return new CompoundCond(c1, c2, conj);
    }

    @Override public Query visitEqCond1(QueryGrammarParser.EqCond1Context ctx) {
        Query q1 = visit(ctx.xq(0));
        Query q2 = visit(ctx.xq(1));
        return new EqCond(q1, q2);
    }

    private void constructClause(List<TerminalNode> varList, List<QueryGrammarParser.XqContext> queryList) {
        if(null == varList || null == queryList || varList.size() != queryList.size()) {
            throw new IllegalArgumentException();
        }

        int count = varList.size();
        for(int i=0; i<count; i++) {
            try {
                List<Node> valueList = visit(queryList.get(i)).evaluate(this.doc);
                String varName = varList.get(i).getText();
                Map<String, List<Node>> oldMap = new HashMap<>(this.contextMap);
                this.contextMap.put(varName, valueList);
                this.contextStack.push(oldMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void deconstructClause(int count) {
        if(count < 0 || count > this.contextStack.size()) {
            throw new IllegalArgumentException();
        }
        for(int i=0; i<count; i++) {
            this.contextMap = this.contextStack.pop();
        }
    }

    @Override public Query visitSatCond(QueryGrammarParser.SatCondContext ctx) {
        this.constructClause(ctx.satisfy().VAR(), ctx.satisfy().xq());

        Query finalCond = visit(ctx.cond());
        Query condQuery = null;
        try {
            condQuery = new SatCond(finalCond.evaluate(this.doc));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.deconstructClause(ctx.satisfy().VAR().size());
        }

        return condQuery;
    }

    @Override public Query visitEmptyCond(QueryGrammarParser.EmptyCondContext ctx) {
        Query query = visit(ctx.xq());
        return new EmptyCond(query);
    }

    @Override public Query visitNegCond(QueryGrammarParser.NegCondContext ctx) {
        return new NegCond(visit(ctx.cond()));
    }

    @Override public Query visitParaCond(QueryGrammarParser.ParaCondContext ctx) {
        return visit(ctx.cond());
    }

    @Override public Query visitIsCond1(QueryGrammarParser.IsCond1Context ctx) {
        Query q1 = visit(ctx.xq(0));
        Query q2 = visit(ctx.xq(1));
        return new IsCond(q1, q2);
    }

    @Override public Query visitIsCond2(QueryGrammarParser.IsCond2Context ctx) {
        Query q1 = visit(ctx.xq(0));
        Query q2 = visit(ctx.xq(1));
        return new IsCond(q1, q2);
    }

    @Override public Query visitStartTag(QueryGrammarParser.StartTagContext ctx) { return visitChildren(ctx); }

    @Override public Query visitEndTag(QueryGrammarParser.EndTagContext ctx) { return visitChildren(ctx); }

    @Override public Query visitAp(QueryGrammarParser.ApContext ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryRp3(QueryGrammarParser.UnaryRp3Context ctx) { return visitChildren(ctx); }

    @Override public Query visitBinaryRp1(QueryGrammarParser.BinaryRp1Context ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryRp4(QueryGrammarParser.UnaryRp4Context ctx) { return visitChildren(ctx); }

    @Override public Query visitParaRp(QueryGrammarParser.ParaRpContext ctx) { return visitChildren(ctx); }

    @Override public Query visitBinaryRp2(QueryGrammarParser.BinaryRp2Context ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryRp1(QueryGrammarParser.UnaryRp1Context ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryRp2(QueryGrammarParser.UnaryRp2Context ctx) { return visitChildren(ctx); }

    @Override public Query visitFilterRp(QueryGrammarParser.FilterRpContext ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryRp5(QueryGrammarParser.UnaryRp5Context ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryRp6(QueryGrammarParser.UnaryRp6Context ctx) { return visitChildren(ctx); }

    @Override public Query visitBinaryFt1(QueryGrammarParser.BinaryFt1Context ctx) { return visitChildren(ctx); }

    @Override public Query visitBinaryFt2(QueryGrammarParser.BinaryFt2Context ctx) { return visitChildren(ctx); }

    @Override public Query visitParaFt(QueryGrammarParser.ParaFtContext ctx) { return visitChildren(ctx); }

    @Override public Query visitNegFt(QueryGrammarParser.NegFtContext ctx) { return visitChildren(ctx); }

    @Override public Query visitCompoundFt(QueryGrammarParser.CompoundFtContext ctx) { return visitChildren(ctx); }

    @Override public Query visitUnaryFt(QueryGrammarParser.UnaryFtContext ctx) { return visitChildren(ctx); }

    @Override public Query visitPathOp(QueryGrammarParser.PathOpContext ctx) { return visitChildren(ctx); }

    @Override public Query visitDocName(QueryGrammarParser.DocNameContext ctx) { return visitChildren(ctx); }

    @Override public Query visitFileName(QueryGrammarParser.FileNameContext ctx) { return visitChildren(ctx); }

    @Override public Query visitTagName(QueryGrammarParser.TagNameContext ctx) { return visitChildren(ctx); }

    @Override public Query visitAttName(QueryGrammarParser.AttNameContext ctx) { return visitChildren(ctx); }

    @Override public Query visitCompOp(QueryGrammarParser.CompOpContext ctx) { return visitChildren(ctx); }

    @Override public Query visitStringCondition(QueryGrammarParser.StringConditionContext ctx) { return visitChildren(ctx); }
}
