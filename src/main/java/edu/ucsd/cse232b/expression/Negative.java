package edu.ucsd.cse232b.expression;

public enum Negative {

    NEG("not");

    private final String op;

    Negative(final String str) {
        this.op = str;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Negative fromString(final String operator) {
        for (Negative b : Negative.values()) {
            if (b.op.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
