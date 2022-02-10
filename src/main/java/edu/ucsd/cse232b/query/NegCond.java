package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class NegCond implements Query {

    private final Query cond;

    public NegCond(Query cond) {
        Objects.requireNonNull(cond, "Query is NULL!");
        this.cond = cond;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> res = this.cond.evaluate(doc);
        if(null == res) {
            return List.of();
        }
        return null;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.NegCond;
    }
}
