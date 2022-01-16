package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class StringFT extends Filter {

    final RelativePath rp;
    final String content;

    public StringFT(RelativePath rp, String s) {
        Objects.requireNonNull(rp, "Relative path is NULL!");
        Objects.requireNonNull(s, "Filter content is NULL!");

        this.rp = rp;
        this.content = s;
    }

    @Override
    public String toString() {
        return this.rp.toString() + "=" + this.content;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.rp, this.content);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        StringFT that = (StringFT) o;
        return Objects.equals(this.rp, that.rp) && Objects.equals(this.content, that.content);
    }
}
