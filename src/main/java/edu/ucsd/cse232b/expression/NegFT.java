package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class NegFT extends Filter {

    final Filter filter;

    public NegFT(Filter f) {
        Objects.requireNonNull(f, "Filter is NULL!");
        this.filter = f;
    }

    @Override
    public String toString() {
        return this.filter.toString();
    }

    @Override
    public int hashCode() {
        return this.filter.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        NegFT that = (NegFT) o;
        return Objects.equals(this.filter, that.filter);
    }
}
