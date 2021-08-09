package com.homecompany.chapter10.exercise2;

public interface Selector {
    boolean end();
    Object current();
    void next();
    Sequence getSequence ();
}
