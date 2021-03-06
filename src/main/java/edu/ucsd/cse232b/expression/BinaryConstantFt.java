package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* for [rp EQS StringConstant]
* */
public class BinaryConstantFt implements Expression{

    // default EQS comparator
    final private Expression leftRp;
    final private String constant;

    public BinaryConstantFt(Expression leftRp, String constant) {
        Objects.requireNonNull(leftRp, "leftRp is NULL!");
        Objects.requireNonNull(constant, "condition constant is NULL!");

        this.leftRp = leftRp;
        this.constant = constant;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> resultList = new ArrayList<>();
        for(Node n : inputNodes) {
            for(Node m : this.filter(this.leftRp, n)) {
                if(this.constant.equals(m.getNodeValue())) {
                    resultList.add(n);
                    break;
                }
            }
        }
        return resultList;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.BinaryFt;
    }
}
