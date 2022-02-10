package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class IsCond implements Query {

    private final Query q1;
    private final Query q2;

    public IsCond(Query q1, Query q2) {
        Objects.requireNonNull(q1, "Query 1 is NULL!");
        Objects.requireNonNull(q2, "Query 2 is NULL!");
        this.q1 = q1;
        this.q2 = q2;
    }

    @Override
    // if returned list is NULL, then the condition is false
    // Or it is true
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> resLeft = this.q1.evaluate(doc);
        List<Node> resRight = this.q2.evaluate(doc);
        for(Node n : resLeft) {
            for(Node m : resRight) {
                if(n.isSameNode(m)) {
                    return List.of();
                }
            }
        }
        return null;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.IsCond;
    }
}
