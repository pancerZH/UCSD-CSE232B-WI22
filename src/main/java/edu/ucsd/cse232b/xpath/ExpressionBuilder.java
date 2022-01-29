package edu.ucsd.cse232b.xpath;

import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.expression.*;

import static edu.ucsd.cse232b.expression.BinaryFt.compFromString;
import static edu.ucsd.cse232b.expression.CompoundFt.conjFromString;

public class ExpressionBuilder extends ExpressionGrammarBaseVisitor<Expression> {

    @Override
    public Expression visitAp(ExpressionGrammarParser.ApContext ctx) {
        String docName = ctx.doc().StringConstant().getText();
        Expression.PathOp op = Expression.opFromString(ctx.pathOp().getText());
        Expression rp = visit(ctx.rp());
        return new AbsolutePath(docName, op, rp);
    }

    @Override
    public Expression visitUnaryRp3(ExpressionGrammarParser.UnaryRp3Context ctx) {
        return new UnaryRp(UnaryRp.Type.Text, "text()");
    }

    @Override
    public Expression visitBinaryRp1(ExpressionGrammarParser.BinaryRp1Context ctx) {
        Expression leftRp = visit(ctx.rp(0));
        BinaryRp.Op op = BinaryRp.opFromString(ctx.pathOp().getText());
        Expression rightRp = visit(ctx.rp(1));
        return new BinaryRp(leftRp, rightRp, op);
    }

    @Override
    public Expression visitUnaryRp4(ExpressionGrammarParser.UnaryRp4Context ctx) {
        return new UnaryRp(UnaryRp.Type.Star, "*");
    }

    @Override
    public Expression visitParaRp(ExpressionGrammarParser.ParaRpContext ctx) {
        Expression rp = visit(ctx.rp());
        return new ParaRp(rp);
    }

    @Override
    public Expression visitBinaryRp2(ExpressionGrammarParser.BinaryRp2Context ctx) {
        Expression leftRp = visit(ctx.rp(0));
        BinaryRp.Op op = BinaryRp.opFromString(ctx.COMMA().getText());
        Expression rightRp = visit(ctx.rp(1));
        return new BinaryRp(leftRp, rightRp, op);
    }

    @Override
    public Expression visitUnaryRp1(ExpressionGrammarParser.UnaryRp1Context ctx) {
        return new UnaryRp(UnaryRp.Type.Tag, ctx.tagName().getText());
    }

    @Override
    public Expression visitUnaryRp2(ExpressionGrammarParser.UnaryRp2Context ctx) {
        return new UnaryRp(UnaryRp.Type.Att, ctx.attName().StringConstant().getText());
    }

    @Override
    public Expression visitFilterRp(ExpressionGrammarParser.FilterRpContext ctx) {
        Expression rp = visit(ctx.rp());
        Expression ft = visit(ctx.filter());
        return new FilterRp(rp, ft);
    }

    @Override
    public Expression visitUnaryRp5(ExpressionGrammarParser.UnaryRp5Context ctx) {
        return new UnaryRp(UnaryRp.Type.Self, ".");
    }

    @Override
    public Expression visitUnaryRp6(ExpressionGrammarParser.UnaryRp6Context ctx) {
        return new UnaryRp(UnaryRp.Type.Pent, "..");
    }

    @Override
    public Expression visitBinaryFt1(ExpressionGrammarParser.BinaryFt1Context ctx) {
        Expression rpLeft = visit(ctx.rp(0));
        Expression rpRight = visit(ctx.rp(1));
        BinaryFt.Comparator comp = compFromString(ctx.compOp().getText());
        return new BinaryFt(rpLeft, rpRight, comp);
    }

    @Override
    public Expression visitBinaryFt2(ExpressionGrammarParser.BinaryFt2Context ctx) {
        Expression rp = visit(ctx.rp());
        return new BinaryConstantFt(rp, ctx.stringCondition().StringConstant().getText());
    }

    @Override
    public Expression visitParaFt(ExpressionGrammarParser.ParaFtContext ctx) {
        Expression ft = visit(ctx.filter());
        return new ParaFt(ft);
    }

    @Override
    public Expression visitNegFt(ExpressionGrammarParser.NegFtContext ctx) {
        Expression ft = visit(ctx.filter());
        return new NegFt(ft);
    }

    @Override
    public Expression visitCompoundFt(ExpressionGrammarParser.CompoundFtContext ctx) {
        Expression ft1 = visit(ctx.filter(0));
        Expression ft2 = visit(ctx.filter(1));
        CompoundFt.CONJ conj = conjFromString(ctx.CONJ().getText());
        return new CompoundFt(ft1, ft2, conj);
    }

    @Override
    public Expression visitUnaryFt(ExpressionGrammarParser.UnaryFtContext ctx) {
        Expression rp = visit(ctx.rp());
        return new UnaryFt(rp);
    }
}