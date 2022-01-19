package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class FilterRP extends RelativePath {

    final RelativePath rp;
    final Filter ft;

    public FilterRP(RelativePath r, Filter f) {
        Objects.requireNonNull(r, "Relative path is NULL!");
        Objects.requireNonNull(f, "Filter is NULL!");

        this.rp = r;
        this.ft = f;
    }

    @Override
    public String toString() {
        return this.rp.toString() + "(" + this.ft.toString() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.rp, this.ft);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        FilterRP that = (FilterRP) o;
        return Objects.equals(this.rp, that.rp) && Objects.equals(this.ft, that.ft);
    }
}
