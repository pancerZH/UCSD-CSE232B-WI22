package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class BinaryXq implements Query {

    private final Query query1;
    private final Query query2;

    public BinaryXq(Query q1, Query q2) {
        Objects.requireNonNull(q1, "Query 1 is NULL!");
        Objects.requireNonNull(q2, "Query 2 is NULL!");
        this.query1 = q1;
        this.query2 = q2;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> res = this.query1.evaluate(doc);
        res.addAll(this.query2.evaluate(doc));
        return res;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.BinaryXq;
    }
}
