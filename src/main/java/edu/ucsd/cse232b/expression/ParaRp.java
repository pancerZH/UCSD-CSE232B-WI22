package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* leading and trailing parentheses should be ignored
* */
public class ParaRp implements Expression{

    final private Expression rp;

    public ParaRp(Expression rp) {
        Objects.requireNonNull(rp, "rp is NULL!");

        this.rp = rp;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        return this.rp.evaluate(inputNodes);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.ParaRp;
    }
}
