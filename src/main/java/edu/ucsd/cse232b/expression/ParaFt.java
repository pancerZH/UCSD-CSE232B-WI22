package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class ParaFt implements Expression{

    final private Expression ft;

    public ParaFt(Expression ft) {
        Objects.requireNonNull(ft, "filter is null!");

        this.ft = ft;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        return this.ft.evaluate(inputNodes);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.ParaFt;
    }
}
