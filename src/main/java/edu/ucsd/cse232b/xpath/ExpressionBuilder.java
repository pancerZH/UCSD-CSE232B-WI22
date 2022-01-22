package edu.ucsd.cse232b.xpath;

import edu.ucsd.CSE232B.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.expression.AbsolutePath;
import edu.ucsd.cse232b.expression.BinaryRp;
import edu.ucsd.cse232b.expression.Expression;
import edu.ucsd.cse232b.expression.UnaryRp;

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
        return super.visitParaRp(ctx);
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
        return super.visitFilterRp(ctx);
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
        return super.visitBinaryFt1(ctx);
    }

    @Override
    public Expression visitBinaryFt2(ExpressionGrammarParser.BinaryFt2Context ctx) {
        return super.visitBinaryFt2(ctx);
    }

    @Override
    public Expression visitParaFt(ExpressionGrammarParser.ParaFtContext ctx) {
        return super.visitParaFt(ctx);
    }

    @Override
    public Expression visitNegFt(ExpressionGrammarParser.NegFtContext ctx) {
        return super.visitNegFt(ctx);
    }

    @Override
    public Expression visitCompoundFt(ExpressionGrammarParser.CompoundFtContext ctx) {
        return super.visitCompoundFt(ctx);
    }

    @Override
    public Expression visitUnaryFt(ExpressionGrammarParser.UnaryFtContext ctx) {
        return super.visitUnaryFt(ctx);
    }
}