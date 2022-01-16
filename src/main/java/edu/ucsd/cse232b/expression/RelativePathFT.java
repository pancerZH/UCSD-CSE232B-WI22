package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class RelativePathFT extends Filter {

    final RelativePath rp;

    public RelativePathFT(RelativePath rp) {
        Objects.requireNonNull(rp);
        this.rp = rp;
    }

    @Override
    public String toString() {
        return this.rp.toString();
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
        RelativePathFT that = (RelativePathFT) o;
        return Objects.equals(this.rp, that.rp);
    }

}
