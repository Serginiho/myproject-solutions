package com.homecompany.chapter15.exercise42;

public interface Collector<T> extends UnaryFunction<T,T> {
    T result();
}
