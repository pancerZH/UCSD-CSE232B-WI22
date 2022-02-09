package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class ApXq implements Query {

    private final List<Node> nodeList;

    public ApXq(List<Node> list) {
        Objects.requireNonNull(list, "Node list is NULL!");
        this.nodeList = list;
    }


    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        return this.nodeList;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.ApXq;
    }
}
