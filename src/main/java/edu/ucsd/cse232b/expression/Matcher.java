package edu.ucsd.cse232b.expression;

public enum Matcher {

    STAR("*"),
    SELF("."),
    PARENT("..");

    private final String op;

    Matcher(final String str) {
        this.op = str;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Matcher fromString(final String operator) {
        for (Matcher b : Matcher.values()) {
            if (b.op.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
