package edu.ucsd.cse232b.expression;

public enum Slash {

    SL("/"),
    DSL("//");

    private final String op;

    Slash(final String str) {
        this.op = str;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Slash fromString(final String operator) {
        for (Slash b : Slash.values()) {
            if (b.op.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
