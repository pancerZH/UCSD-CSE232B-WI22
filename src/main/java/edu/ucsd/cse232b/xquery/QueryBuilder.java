package edu.ucsd.cse232b.xquery;

import edu.ucsd.cse232b.expression.Expression;
import edu.ucsd.cse232b.parsers.QueryGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import edu.ucsd.cse232b.query.*;
import edu.ucsd.cse232b.xpath.ExpressionBuilder;
import edu.ucsd.cse232b.xpath.Xpath;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class QueryBuilder extends QueryGrammarBaseVisitor<Query> {

    private final Map<String, List<Node>> contextMap;
    private final Stack<Map<String, List<Node>>> contextStack;
    private final Xpath xpath;
    private final ExpressionBuilder expBuilder;

    public QueryBuilder() throws Exception {
        this.contextMap = new HashMap<>();  // current context
        this.contextStack = new Stack<>();  // for variable scope
        this.xpath = new Xpath();
        this.expBuilder = new ExpressionBuilder();
    }

    @Override public Query visitRpXq(QueryGrammarParser.RpXqContext ctx) {
        Query query = visit(ctx.xq());
        Expression exp = this.expBuilder.visit(ctx.rp());
        Query.PathOp op = Query.opFromString(ctx.pathOp().getText());
        return new RpXq(query, op, exp);
    }
    
    @Override public Query visitStringXq(QueryGrammarParser.StringXqContext ctx) {
        return new StringXq(ctx.STRING().getText());
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
        return new VarXq(this.contextMap, ctx.VAR().getText());
    }

    @Override public Query visitLetXq(QueryGrammarParser.LetXqContext ctx) { return visitChildren(ctx); }

    @Override public Query visitForXq(QueryGrammarParser.ForXqContext ctx) { return visitChildren(ctx); }

    @Override public Query visitTagXq(QueryGrammarParser.TagXqContext ctx) { return visitChildren(ctx); }

    @Override public Query visitForClause(QueryGrammarParser.ForClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitLetClause(QueryGrammarParser.LetClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitWhereClause(QueryGrammarParser.WhereClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitReturnClause(QueryGrammarParser.ReturnClauseContext ctx) { return visitChildren(ctx); }

    @Override public Query visitEqCond2(QueryGrammarParser.EqCond2Context ctx) { return visitChildren(ctx); }

    @Override public Query visitCompoundCond(QueryGrammarParser.CompoundCondContext ctx) { return visitChildren(ctx); }

    @Override public Query visitEqCond1(QueryGrammarParser.EqCond1Context ctx) { return visitChildren(ctx); }

    @Override public Query visitSatCond(QueryGrammarParser.SatCondContext ctx) { return visitChildren(ctx); }

    @Override public Query visitEmptyCond(QueryGrammarParser.EmptyCondContext ctx) { return visitChildren(ctx); }

    @Override public Query visitNegCond(QueryGrammarParser.NegCondContext ctx) { return visitChildren(ctx); }

    @Override public Query visitParaCond(QueryGrammarParser.ParaCondContext ctx) { return visitChildren(ctx); }

    @Override public Query visitIsCond1(QueryGrammarParser.IsCond1Context ctx) { return visitChildren(ctx); }

    @Override public Query visitIsCond2(QueryGrammarParser.IsCond2Context ctx) { return visitChildren(ctx); }

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
