package edu.ucsd.cse232b.expression;

import java.security.InvalidParameterException;
import java.util.Objects;

public class StringRP extends RelativePath {

    final String content;

    public StringRP(final String s) {
        Objects.requireNonNull(s, "The content is NULL!");
        this.content = s;
    }

    @Override
    public String toString() {
        return this.content;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.content);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(null == o || this.getClass() != o.getClass()) {
            return false;
        }
        StringRP that = (StringRP) o;
        return Objects.equals(this.content, that.content);
    }
}
