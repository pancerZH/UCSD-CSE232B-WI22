package edu.ucsd.cse232b.query;

import edu.ucsd.cse232b.expression.Expression;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class RpXq implements Query {

    private final Query query;
    private final PathOp op;
    private final Expression rp;

    public RpXq(Query query, PathOp op, Expression rp) {
        Objects.requireNonNull(query, "Query is NULL!");
        Objects.requireNonNull(op, "Op is NULL!");
        Objects.requireNonNull(rp, "Relative path is NULL!");
        this.query = query;
        this.op = op;
        this.rp = rp;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> res = this.query.evaluate(doc);
        switch (this.op) {
            case SL:
                return new ArrayList<>(new HashSet<>(this.rp.evaluate(res)));
            case DSL:
                List<Node> descendingList = new ArrayList<>();
                getAllDescentNodes(res, descendingList);
                return new ArrayList<>(new HashSet<>(this.rp.evaluate(descendingList)));
            default:
                throw new Exception("Evaluation error in " + this);
        }
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.RpXq;
    }
}
