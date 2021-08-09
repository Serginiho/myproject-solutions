package com.homecompany.chapter15.exercise4;

interface Selector<T> {
    boolean end();
    T current();
    void next();
}
