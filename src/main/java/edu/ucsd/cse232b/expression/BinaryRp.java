package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryRp implements Expression{
    public BinaryRp(Expression leftRp, Expression rightRp, Op op) {
        Objects.requireNonNull(leftRp, "leftRp is NULL!");
        Objects.requireNonNull(rightRp, "rightRp content is NULL!");
        Objects.requireNonNull(op, "op path is NULL!");

        this.leftRp = leftRp;
        this.rightRp = rightRp;
        this.op = op;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception {
        List<Node> leftResult = leftRp.evaluate(inputNodes);
        switch (op) {
            case SL:
                return rightRp.evaluate(leftResult);
            case DSL:
                List<Node> rightInput = new ArrayList<>();
                getAllDescentNodes(leftResult, rightInput);
                return rightRp.evaluate(rightInput);
            case COMMA:
                boolean success = leftResult.addAll(rightRp.evaluate(inputNodes));
                if(success) {
                    return leftResult;
                }
                return null;
            default:
                throw new Exception("Evaluation error in " + this);
        }
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.BinaryRp;
    }

    public static Op opFromString(String s) {
        return switch (s) {
            case "/" -> Op.SL;
            case "//" -> Op.DSL;
            case "," -> Op.COMMA;
            default -> null;
        };
    }

    public enum Op {
        SL, DSL, COMMA
    }

    final private Expression leftRp;
    final private Expression rightRp;
    final private Op op;
}
