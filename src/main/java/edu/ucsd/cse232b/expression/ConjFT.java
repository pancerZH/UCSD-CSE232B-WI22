package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class ConjFT extends Filter {

    final Filter f1;
    final Conjunction cj;
    final Filter f2;

    public ConjFT(Filter f1, Conjunction cj, Filter f2) {
        Objects.requireNonNull(f1, "Filter is NULL!");
        Objects.requireNonNull(cj, "Conjunction operator is NULL!");
        Objects.requireNonNull(f2, "Filter is NULL!");

        this.f1 = f1;
        this.cj = cj;
        this.f2 = f2;
    }

    @Override
    public String toString() {
        return this.f1.toString() + this.cj.toString() + this.f2.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.f1, this.cj, this.f2);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        ConjFT that = (ConjFT) o;
        return Objects.equals(this.f1, that.f1) && Objects.equals(this.cj, that.cj) && Objects.equals(this.f2, that.f2);
    }
}
