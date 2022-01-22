package edu.ucsd.cse232b.expression;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnaryRp implements Expression{
    public UnaryRp(Type type, String unary) {
        Objects.requireNonNull(type, "unary rp type is NULL!");
        Objects.requireNonNull(unary, "unary rp content is NULL!");

        this.type = type;
        this.unary = unary;
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception{
        List<Node> result = new ArrayList<>();
        for(Node n: inputNodes) {
            if(type == Type.Self) {
                result.add(n);
            } else if (type == Type.Pent) {
                result.add(n.getParentNode());
            } else {
                NodeList childNodes = n.getChildNodes();
                for (int i = 0; i < childNodes.getLength(); i++) {
                    Node childNode = childNodes.item(i);
                    switch (type) {
                        case Tag:
                            if (childNode.getNodeType() == Node.ELEMENT_NODE && childNode.getNodeName().equals(unary)) {
                                result.add(childNode);
                            }
                            break;
                        case Att:
                            if (childNode.getNodeType() == Node.ATTRIBUTE_NODE && childNode.getNodeName().equals(unary)) {
                                result.add(childNode);
                            }
                            break;
                        case Text:
                            if (childNode.getNodeType() == Node.TEXT_NODE) {
                                result.add(childNode);
                            }
                        case Star:
                            result.add(childNode);
                            break;
                        default:
                            throw new Exception("Evaluation error in " + this);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.UnaryRp;
    }

    public enum Type {
        Tag, Att, Text, Star, Self, Pent
    }

    final private Type type;
    final private String unary;

    @Override
    public String toString() {
        return "UnaryRp{" +
                "type=" + type +
                ", unary='" + unary + '\'' +
                '}';
    }
}
