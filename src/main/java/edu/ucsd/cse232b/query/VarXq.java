package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VarXq implements Query {

    private final Map<String, List<Node>> contextMap;
    private final String varName;

    public VarXq(Map<String, List<Node>> map, String name) {
        Objects.requireNonNull(map, "Context map is NULL");
        Objects.requireNonNull(name, "Variable name is NULL!");
        this.contextMap = map;
        this.varName = name;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        return this.contextMap.get(this.varName);
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.VarXq;
    }
}
