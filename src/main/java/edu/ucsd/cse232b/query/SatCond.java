package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public class SatCond implements Query {

    private final boolean condRes;

    public SatCond(List<Node> condRes) {
        this.condRes = (condRes != null);
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        return this.condRes ? List.of():null;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.SatCond;
    }
}
