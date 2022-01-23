package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnaryFt implements Expression{

    final private Expression rp;

    public UnaryFt(Expression rp) {
        Objects.requireNonNull(rp, "rp is NULL!");

        this.rp = rp;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> resultList = new ArrayList<>();
        for(Node n : inputNodes) {
            if(!this.filter(this.rp, n).isEmpty()) {
                resultList.add(n);
            }
        }
        return resultList;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.UnaryFt;
    }
}
