package edu.ucsd.cse232b.expression;


import java.security.InvalidParameterException;
import java.util.Objects;

public class MatcherRP extends RelativePath {

    final Matcher matcher;

    public MatcherRP(Matcher m) {
        Objects.requireNonNull(m, "Operator is null!");
        this.matcher = m;
    }

    @Override
    public String toString() {
        return this.matcher.toString();
    }

    @Override
    public int hashCode() {
        return this.matcher.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        MatcherRP that = (MatcherRP) o;
        return Objects.equals(this.matcher, that.matcher);
    }
}
