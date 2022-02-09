package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class StringXq implements Query {

    final private String str;

    public StringXq(String content) {
        Objects.requireNonNull(content, "String content is NULL!");
        this.str = content;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        return List.of(makeText(doc, this.str));
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.StringXq;
    }
}
