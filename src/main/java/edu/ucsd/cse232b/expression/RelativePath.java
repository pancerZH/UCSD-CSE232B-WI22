package edu.ucsd.cse232b.expression;

public abstract class RelativePath implements Expression {

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.RP;
    }
}
