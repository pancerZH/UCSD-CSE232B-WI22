package edu.ucsd.cse232b.expression;

import java.util.Objects;

public class CommaRP extends RelativePath {

    final RelativePath firstRP;
    final RelativePath lastPath;

    public CommaRP(RelativePath rp1, RelativePath rp2) {
        Objects.requireNonNull(rp1, "Relative path is NULL!");
        Objects.requireNonNull(rp2, "Relative path is NULL!");

        this.firstRP = rp1;
        this.lastPath = rp2;
    }

    @Override
    public String toString() {
        return this.firstRP.toString() + this.lastPath.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstRP, this.lastPath);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        CommaRP that = (CommaRP) o;
        return Objects.equals(this.firstRP, that.firstRP) && Objects.equals(this.lastPath, that.lastPath);
    }
}
