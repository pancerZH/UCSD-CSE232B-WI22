package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* for [rp compOp rp #BinaryFt1]
* */
public class BinaryFt implements Expression{

    final private Expression leftRp;
    final private Expression rightRp;
    final private Comparator comp;

    public BinaryFt(Expression leftRp, Expression rightRp, Comparator comp) {
        Objects.requireNonNull(leftRp, "leftRp is NULL!");
        Objects.requireNonNull(rightRp, "rightRp is NULL!");
        Objects.requireNonNull(comp, "comparator is NULL!");

        this.leftRp = leftRp;
        this.rightRp = rightRp;
        this.comp = comp;
    }

    public enum Comparator {
        EQS, EQ, ISS, IS
    }

    public static Comparator compFromString(String s) {
        return switch (s) {
            case "=" -> Comparator.EQS;
            case "eq" -> Comparator.EQ;
            case "==" -> Comparator.ISS;
            case "is" -> Comparator.IS;
            default -> null;
        };
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> leftResult = this.leftRp.evaluate(inputNodes);
        List<Node> rightResult = this.rightRp.evaluate(inputNodes);
        List<Node> resultList = new ArrayList<>();
        switch (this.comp) {
            case EQS:
            case EQ:
                // TODO: a better way to compare two lists of nodes?
                for(Node n : leftResult) {
                    for(Node m : rightResult) {
                        if(n.isEqualNode(m)) {
                            resultList.add(n);
                            break;
                        }
                    }
                }
                break;
            case ISS:
            case IS:
                for(Node n : leftResult) {
                    for(Node m : rightResult) {
                        if(n.isSameNode(m)) {
                            resultList.add(n);
                            break;
                        }
                    }
                }
                break;
            default:
                throw new Exception("Not supported comparator: " + this.comp);
        }
        return resultList;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.BinaryFt;
    }
}
