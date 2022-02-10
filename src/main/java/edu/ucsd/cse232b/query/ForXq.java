package edu.ucsd.cse232b.query;

import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

// TODO: finish it after cond
public class ForXq implements Query {

    private final Map<String, List<Node>> contextMap;
    private final Stack<Map<String, List<Node>>> contextStack;
    private final QueryGrammarParser.ForXqContext ctx;

    public ForXq(QueryGrammarParser.ForXqContext ctx,
                 Map<String, List<Node>> contextMap,
                 Stack<Map<String, List<Node>>> contextStack) {
        Objects.requireNonNull(ctx, "Context is NULL!");
        Objects.requireNonNull(contextMap, "Context map is NULL!");
        Objects.requireNonNull(contextStack, "Context stack is NULL!");

        this.contextMap = contextMap;
        this.contextStack = contextStack;
        this.ctx = ctx;
    }

    @Override
    // forClause letClause whereClause returnClause
    public List<Node> evaluate(Document doc) throws Exception {

        return null;
    }

    private Map<String, List<Node>> processForClause(Document doc, List<String> vars, List<Query> queries) throws Exception {
        Objects.requireNonNull(vars, "Variable list is NULL!");
        Objects.requireNonNull(queries, "Query list is NULL!");
        if(vars.size() != queries.size()) {
            throw new IllegalArgumentException("Variable list has different size from query list!");
        }

        Map<String, List<Node>> res = new HashMap<>();
        for(int i=0; i<vars.size(); i++) {
            res.put(vars.get(i), queries.get(i).evaluate(doc));
        }
        return res;
    }

    @Override
    public QueryKind getQueryKind() {
        return QueryKind.ForClause;
    }
}
