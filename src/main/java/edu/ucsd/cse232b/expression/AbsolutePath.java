package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class AbsolutePath implements Expression {

    final String doc;
    final Slash sl;
    final RelativePath rp;

    public AbsolutePath(String d, Slash s, RelativePath rp) {
        Objects.requireNonNull(d, "Doc is NULL!");
        Objects.requireNonNull(s, "Slash content is NULL!");
        Objects.requireNonNull(rp, "Relative path is NULL!");

        this.doc = d;
        this.sl = s;
        this.rp = rp;
    }

    @Override
    public String toString() {
        return this.doc + this.sl.toString() + this.rp.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.doc, this.sl, this.rp);
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
        return Objects.equals(this.doc, that.doc) && Objects.equals(this.sl, that.sl) && Objects.equals(this.rp, that.rp);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.AP;
    }
}
