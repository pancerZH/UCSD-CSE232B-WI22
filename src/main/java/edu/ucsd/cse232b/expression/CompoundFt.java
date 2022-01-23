package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompoundFt implements Expression{

    final private Expression ft1;
    final private Expression ft2;
    final private CONJ conj;

    public CompoundFt(Expression ft1, Expression ft2, CONJ conj) {
        Objects.requireNonNull(ft1, "Filter 1 is null!");
        Objects.requireNonNull(ft2, "filter 2 is NULL!");
        Objects.requireNonNull(conj, "Conjunction is NULL!");

        this.ft1 = ft1;
        this.ft2 = ft2;
        this.conj = conj;
    }

    public enum CONJ {
        AND, OR;
    }

    public static CONJ conjFromString(String s) {
        return switch (s) {
            case "and" -> CONJ.AND;
            case "or" -> CONJ.OR;
            default -> null;
        };
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> leftResult = this.ft1.evaluate(inputNodes);
        switch (this.conj) {
            case AND:
                return this.ft2.evaluate(leftResult);
            case OR:
                List<Node> rightResult = this.ft2.evaluate(inputNodes);
                List<Node> resultList = new ArrayList<>(rightResult);
                for(Node n : leftResult) {
                    boolean shouldAdd = true;
                    for (int i=0; i<rightResult.size(); i++) {
                        Node m = rightResult.get(i);
                        if (n.isSameNode(m)) {
                            shouldAdd = false;
                            rightResult.remove(i);
                            break;
                        }
                    }
                    if(shouldAdd) {
                        resultList.add(n);
                    }
                }
                return resultList;
            default:
                throw new Exception("Not supported conjunction: " + this.conj);
        }
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.CompoundFt;
    }
}
