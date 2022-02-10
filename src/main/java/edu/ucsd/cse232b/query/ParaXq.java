package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class ParaXq implements Query {

    private final Query query;

    public ParaXq(Query query) {
        Objects.requireNonNull(query, "Query is NULL!");
        this.query = query;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        return this.query.evaluate(doc);
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.ParaXq;
    }
}
