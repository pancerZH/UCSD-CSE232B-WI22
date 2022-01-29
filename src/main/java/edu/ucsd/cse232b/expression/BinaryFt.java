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

    private boolean checkEqual(List<Node> list1, List<Node> list2) {
        Objects.requireNonNull(list1);
        Objects.requireNonNull(list2);
        for(Node n : list1) {
            for(Node m : list2) {
                if(n.isEqualNode(m)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkSame(List<Node> list1, List<Node> list2) {
        Objects.requireNonNull(list1);
        Objects.requireNonNull(list2);
        for(Node n : list1) {
            for(Node m : list2) {
                if(n.isSameNode(m)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> resultList = new ArrayList<>();
        switch (this.comp) {
            case EQS:
            case EQ:
                // TODO: a better way to compare two lists of nodes?
                for(Node n : inputNodes) {
                    List<Node> left = this.filter(this.leftRp, n);
                    List<Node> right = this.filter(this.rightRp, n);
                    if(this.checkEqual(left, right)) {
                        resultList.add(n);
                    }
                }
                break;
            case ISS:
            case IS:
                for(Node n : inputNodes) {
                    List<Node> left = this.filter(this.leftRp, n);
                    List<Node> right = this.filter(this.rightRp, n);
                    if(this.checkSame(left, right)) {
                        resultList.add(n);
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
