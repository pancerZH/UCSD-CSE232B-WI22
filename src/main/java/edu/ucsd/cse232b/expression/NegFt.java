package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NegFt implements Expression{

    final private Expression ft;

    public NegFt(Expression ft) {
        Objects.requireNonNull(ft, "filter is NULL!");

        this.ft = ft;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> interList = this.ft.evaluate(inputNodes);
        List<Node> resList = new ArrayList<>(inputNodes);
        for(Node n : interList) {
            resList.remove(n);
        }
        return resList;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NegFt;
    }
}
