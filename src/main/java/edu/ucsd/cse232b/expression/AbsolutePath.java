package edu.ucsd.cse232b.expression;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AbsolutePath implements Expression {
    public String getDoc() {
        return doc;
    }

    public AbsolutePath(String d, PathOp s, Expression rp) {
        Objects.requireNonNull(d, "Doc is NULL!");
        Objects.requireNonNull(s, "Slash content is NULL!");
        Objects.requireNonNull(rp, "Relative path is NULL!");

        this.doc = d;
        this.pathOp = s;
        this.rp = rp;
    }

    @Override
    public String toString() {
        return this.doc + this.pathOp + this.rp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.doc, this.pathOp, this.rp);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        AbsolutePath that = (AbsolutePath) o;
        return Objects.equals(this.doc, that.doc) && Objects.equals(this.pathOp, that.pathOp) && Objects.equals(this.rp, that.rp);
    }

    @Override
    public List<Node> evaluate(List<Node> inputNodes) throws Exception{
        if(pathOp == PathOp.SL) {
            return rp.evaluate(inputNodes);
        } else {
            List<Node> rpInput = new ArrayList<>();
            getAllDescentNodes(inputNodes, rpInput);
            return rp.evaluate(rpInput);
        }
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.AP;
    }

    final private String doc;
    final private PathOp pathOp;
    final private Expression rp;
}
