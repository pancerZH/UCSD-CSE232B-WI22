package edu.ucsd.cse232b.expression;

import java.security.InvalidParameterException;
import java.util.Objects;

public class SlashRP extends RelativePath {

    final RelativePath firstRP;
    final Slash sl;
    final RelativePath lastPath;

    public SlashRP(RelativePath rp1, Slash slash, RelativePath rp2) {
        Objects.requireNonNull(rp1, "Relative path is NULL!");
        Objects.requireNonNull(slash, "Slash content is NULL!");
        Objects.requireNonNull(rp2, "Relative path is NULL!");

        this.firstRP = rp1;
        this.sl = slash;
        this.lastPath = rp2;
    }

    @Override
    public String toString() {
        return this.firstRP.toString() + this.sl.toString() + this.lastPath.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstRP, this.sl, this.lastPath);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        SlashRP that = (SlashRP) o;
        return Objects.equals(this.firstRP, that.firstRP) && Objects.equals(this.sl, that.sl) && Objects.equals(this.lastPath, that.lastPath);
    }
}
