package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class DoubleRPFT extends Filter {

    final RelativePath rp1;
    final Comparator op;
    final RelativePath rp2;

    public DoubleRPFT(RelativePath rp1, Comparator c, RelativePath rp2) {
        Objects.requireNonNull(rp1, "Relative path is NULL!");
        Objects.requireNonNull(c, "Comparator is NULL!");
        Objects.requireNonNull(rp2, "Relative path is NULL");

        this.rp1 = rp1;
        this.op = c;
        this.rp2 = rp2;
    }

    @Override
    public String toString() {
        return this.rp1.toString() + this.op.toString() + this.rp2.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.rp1, this.op, this.rp2);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        DoubleRPFT that = (DoubleRPFT) o;
        return Objects.equals(this.rp1, that.rp1) && Objects.equals(this.op, that.op) && Objects.equals(this.rp2, that.rp2);
    }
}
