package edu.ucsd.cse232b.expression;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface Expression {
    List<Node> evaluate(List<Node> inputNodes) throws Exception;
    ExpressionKind getExpressionKind();
    static PathOp opFromString(String s) {
        if(s.equals("/")) {
            return PathOp.SL;
        } else if (s.equals("//")){
            return PathOp.DSL;
        } else {
            return null;
        }
    }

    /*
    * check node one by one
    * */
    default List<Node> filter(Expression rp, Node inputNode) throws Exception {
        Objects.requireNonNull(rp);
        Objects.requireNonNull(inputNode);
        return rp.evaluate(List.of(inputNode));
    }

    // TODO: Optimize to return an iterator instead of a in-memory list?
    default void getAllDescentNodes(List<Node> inputNodes, List<Node> result) {
        for(Node n: inputNodes) {
            result.add(n);
            NodeList childNodes = n.getChildNodes();
            List<Node> children = new ArrayList<>();
            for (int i = 0; i < childNodes.getLength(); i++) {
                children.add(childNodes.item(i));
            }
            getAllDescentNodes(children, result);
        }
    }
    enum ExpressionKind {
        AP,
        UnaryRp,
        BinaryRp,
        ParaRp,
        FilterRp,
        UnaryFt,
        BinaryFt,
        ParaFt,
        CompoundFt,
        NegFt
    }

    enum PathOp {
        SL, DSL
    }
}
