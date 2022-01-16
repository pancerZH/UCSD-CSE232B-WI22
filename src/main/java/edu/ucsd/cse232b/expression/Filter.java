package edu.ucsd.cse232b.expression;

public abstract class Filter implements Expression {

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.FILTER;
    }
}
