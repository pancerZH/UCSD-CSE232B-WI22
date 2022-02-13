package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface Query {
    List<Node> evaluate(Document doc) throws Exception;
    QueryKind getQueryKind();

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

    default Node makeText(Document doc, String text) {
        return doc.createTextNode(text);
    }

    default Node makeElement(Document doc, String tagName, List<Node> list) {
        Node node = doc.createElement(tagName);
        for(Node n : list) {
            if(!Objects.isNull(n)) {
                node.appendChild(doc.importNode(n, true));
            }
        }
        return node;
    }

    enum QueryKind {
        VarXq,
        StringXq,
        ApXq,
        ParaXq,
        BinaryXq,
        RpXq,
        TagXq,
        ForClause,
        LetClause,
        WhereClause,
        ReturnClause,
        ForXq,
        LetXq,
        EqCond,
        IsCond,
        EmptyCond,
        SatCond,
        ParaCond,
        CompoundCond,
        NegCond
    }

    enum PathOp {
        SL, DSL
    }

    static PathOp opFromString(String s) {
        if(s.equals("/")) {
            return PathOp.SL;
        } else if (s.equals("//")){
            return PathOp.DSL;
        } else {
            return null;
        }
    }
}
