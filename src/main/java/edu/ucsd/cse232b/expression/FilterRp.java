package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilterRp implements Expression {

    final private Expression rp;
    final private Expression ft;

    public FilterRp(Expression rp, Expression ft) {
        Objects.requireNonNull(rp, "Relative path is NULL!");
        Objects.requireNonNull(ft, "Filter is NULL!");

        this.rp = rp;
        this.ft = ft;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> interResult = this.rp.evaluate(inputNodes);
        return this.ft.evaluate(interResult);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.FilterRp;
    }
}
