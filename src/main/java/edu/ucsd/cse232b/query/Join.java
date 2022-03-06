package edu.ucsd.cse232b.query;

import edu.ucsd.cse232b.xquery.Xquery;
import org.w3c.dom.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Join implements Query {
    public Join (Query left, Query right, List<String> leftAtt, List<String> rightAtt) {
        Objects.requireNonNull(left, "Query left is NULL!");
        Objects.requireNonNull(right, "Query right is NULL!");
        Objects.requireNonNull(leftAtt, "left list is NULL!");
        Objects.requireNonNull(rightAtt, "right list is NULL!");
        this.left = left;
        this.right = right;
        this.leftAtt = leftAtt;
        this.rightAtt = rightAtt;
    }

    public void setTransFormer() throws TransformerConfigurationException {
        TransformerFactory tfFactory = TransformerFactory.newInstance();
        this.tf = tfFactory.newTransformer();
        this.tf.setOutputProperty(OutputKeys.INDENT, "yes");
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        this.setTransFormer();
        List<Node> output = new ArrayList<>();
        List<Node> leftNodes = this.left.evaluate(doc);
        List<Node> rightNodes = this.right.evaluate(doc);
        Map<String, List<Node>> leftMap = new HashMap<>();
        // cartesian product
        if(this.leftAtt.size() == 0 || this.rightAtt.size() == 0) {
            for (Node leftTuple : leftNodes) {
                for (Node rightTuple : rightNodes) {
                    output.add(this.concatTuple(doc, leftTuple, rightTuple));
                }
            }
        } else {
            // in-memory hash join
            for(Node leftTuple: leftNodes) {
                String hashIndex = this.buildHashIndex(leftTuple, this.leftAtt);
                if(!leftMap.containsKey(hashIndex)) {
                    leftMap.put(hashIndex, new ArrayList<>());
                }
                leftMap.get(hashIndex).add(leftTuple);
            }
            for(Node rightTuple: rightNodes) {
                String hashIndex = this.buildHashIndex(rightTuple, this.rightAtt);
                if(leftMap.containsKey(hashIndex)) {
                    List<Node> matchedList = leftMap.get(hashIndex);
                    for (Node node : matchedList) {
                        output.add(this.concatTuple(doc, node, rightTuple));
                    }
                }
            }
        }
        return output;
    }

    private String buildHashIndex(Node tuple, List<String> attrs) throws TransformerException, UnsupportedEncodingException {
        StringBuilder index = new StringBuilder();
        Map<String, Node> tag2Var = new HashMap<>();
        NodeList childNodes = tuple.getChildNodes();
        for(int i=0; i<childNodes.getLength(); i++) {
            assert childNodes.item(i).getChildNodes().getLength() == 1;
            tag2Var.put(childNodes.item(i).getNodeName(), childNodes.item(i).getChildNodes().item(0));
        }
        for(String attr: attrs) {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            this.tf.transform(new DOMSource(tag2Var.get(attr)), new StreamResult(
                    new PrintStream(os)));
            index.append(os.toString("UTF8"));
            index.append("+");
        }
        return index.toString();
    }

    private Node concatTuple(Document doc, Node t1, Node t2) {
        Element tuple = doc.createElement("tuple");
        NodeList left = t1.getChildNodes();
        for (int i = 0; i < left.getLength(); i++) {
            tuple.appendChild(left.item(i).cloneNode(true));
        }
        NodeList right = t2.getChildNodes();
        for (int i = 0; i < right.getLength(); i++) {
            tuple.appendChild(right.item(i).cloneNode(true));
        }
        return tuple;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.Join;
    }

    private Query left;
    private Query right;
    private List<String> leftAtt;
    private List<String> rightAtt;
    private Transformer tf;
}
