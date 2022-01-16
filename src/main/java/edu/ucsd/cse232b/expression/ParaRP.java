package edu.ucsd.cse232b.expression;

import java.security.InvalidParameterException;
import java.util.Objects;

public class ParaRP extends RelativePath {

    final RelativePath rp;

    public ParaRP(RelativePath rp) {
        Objects.requireNonNull(rp, "Relative path is NULL!");
        this.rp = rp;
    }

    @Override
    public String toString() {
        return "(" + this.rp.toString() + ")";
    }

    @Override
    public int hashCode() {
        return this.rp.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        ParaRP that = (ParaRP) o;
        return Objects.equals(this.rp, that.rp);
    }
}
