package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class CompoundCond implements Query {

    private final Query cond1;
    private final Query cond2;
    private final CONJ conj;

    public CompoundCond(Query c1, Query c2, String conj) {
        Objects.requireNonNull(c1, "Condition 1 is NULL!");
        Objects.requireNonNull(c2, "Condition 2 is NULL!");
        Objects.requireNonNull(conj, "Conjunction is NULL!");

        this.cond1 = c1;
        this.cond2 = c2;
        this.conj = conjFromString(conj);
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> leftRes = this.cond1.evaluate(doc);

        switch (this.conj) {
            case OR -> {
                if(null != leftRes || this.cond2.evaluate(doc) != null) {
                    return List.of();
                }
            }
            case AND -> {
                if(null != leftRes && this.cond2.evaluate(doc) != null) {
                    return List.of();
                }
            }
        }
        return null;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.CompoundCond;
    }

    public enum CONJ {
        AND, OR;
    }

    public static CONJ conjFromString(String s) {
        return switch (s.toLowerCase()) {
            case "and" -> CONJ.AND;
            case "or" -> CONJ.OR;
            default -> null;
        };
    }
}
