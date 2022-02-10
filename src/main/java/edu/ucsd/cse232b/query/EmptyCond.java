package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class EmptyCond implements Query {

    private final Query query;

    public EmptyCond(Query query) {
        Objects.requireNonNull(query, "Query is NULL!");
        this.query = query;
    }

    @Override
    // if returned list is NULL, then the condition is false
    // Or it is true
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> res = this.query.evaluate(doc);
        if(null == res || res.isEmpty()) {
            return List.of();
        }
        return null;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.EmptyCond;
    }
}
