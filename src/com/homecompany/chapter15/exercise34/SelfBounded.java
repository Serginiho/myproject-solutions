package com.homecompany.chapter15.exercise34;

abstract class SelfBounded <T extends SelfBounded<T>> {
    abstract T setAndGet (T arg);
    T getElement (T arg) {
        return setAndGet(arg);
    }
}
