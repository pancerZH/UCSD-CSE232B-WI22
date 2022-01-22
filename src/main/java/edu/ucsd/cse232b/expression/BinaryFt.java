package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.List;

public class BinaryFt implements Expression{
    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        return null;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.BinaryFt;
    }
}
