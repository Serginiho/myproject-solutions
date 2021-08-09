package com.homecompany.chapter16.exercise1;

import java.util.Objects;

public class SimpleBerylliumSphere {
    private static long count;
    private final long id = count++;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleBerylliumSphere that = (SimpleBerylliumSphere) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SimpleBerylliumSphere[" + id +
                ']';
    }
}
