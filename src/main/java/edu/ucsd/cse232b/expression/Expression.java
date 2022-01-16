package edu.ucsd.cse232b.expression;

public interface Expression {

    ExpressionKind getExpressionKind();
    enum ExpressionKind {
        AP,
        RP,
        FILTER
    }
}
