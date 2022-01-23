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
        List<Node> resList = new ArrayList<>();
        for(Node n : inputNodes) {
            boolean shouldAdd = true;
            for(int i=0; i<interList.size(); i++) {
                if(n.isSameNode(interList.get(i))) {
                    interList.remove(i);
                    shouldAdd = false;
                    break;
                }
            }
            if(shouldAdd) {
                resList.add(n);
            }
        }
        return resList;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NegFt;
    }
}
