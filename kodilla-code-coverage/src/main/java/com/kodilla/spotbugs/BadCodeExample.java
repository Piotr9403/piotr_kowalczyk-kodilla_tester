package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    public static final double PI = 3.14;
    private String type;

    public static double getPi() {
        return PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample badCodeExample = (BadCodeExample) o;

        return type != null ? type.equals(badCodeExample.type) : badCodeExample.type == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}