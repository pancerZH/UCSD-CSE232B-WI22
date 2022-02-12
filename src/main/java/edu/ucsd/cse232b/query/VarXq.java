package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VarXq implements Query {

    private final List<Node> res;

    public VarXq(List<Node> nodeList) {
        Objects.requireNonNull(nodeList, "Node list is NULL");
        this.res = nodeList;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        return this.res;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.VarXq;
    }
}
