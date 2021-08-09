package com.homecompany.chapter16.exercise19;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ClassForComparison implements Comparable<ClassForComparison> {
    private int value;

    public ClassForComparison(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassForComparison that = (ClassForComparison) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ClassForComparison: " + value;
    }

    @Override
    public int compareTo(@NotNull ClassForComparison o) {
        return Integer.compare(value, o.value);
    }
}
