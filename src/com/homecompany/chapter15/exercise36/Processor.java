package com.homecompany.chapter15.exercise36;

import java.util.List;

interface Processor<T,E1 extends Exception,E2 extends Exception> {
    void process (List<T> resultCollector) throws E1, E2;
}
