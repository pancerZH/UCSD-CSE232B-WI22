package edu.ucsd.cse232b.query;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class TagXq implements Query {

    private final String tagName;
    private final Query query;

    public TagXq(String tagName, Query query) {
        Objects.requireNonNull(tagName, "Tag name is NULL!");
        Objects.requireNonNull(query, "Query is NULL!");
        this.tagName = tagName;
        this.query = query;
    }

    @Override
    public List<Node> evaluate(Document doc) throws Exception {
        List<Node> res = this.query.evaluate(doc);
        Element element = doc.createElement(this.tagName);
        for(Node node : res) {
            element.appendChild(node);
        }
        return List.of(element);
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.TagXq;
    }
}
