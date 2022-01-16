package edu.ucsd.cse232b.expression;

public enum Conjunction {

    AND("and"),
    OR("or");

    private final String op;

    Conjunction(final String str) {
        this.op = str;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Conjunction fromString(final String operator) {
        for (Conjunction b : Conjunction.values()) {
            if (b.op.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
