package com.homecompany.chapter15.exercise36;

import java.util.List;

class Processor1 implements Processor<String, Failure1, Failure2> {
    static int count = 3;

    @Override
    public void process(List<String> resultCollector) throws Failure1, Failure2 {
        if (count-- > 0) {
            resultCollector.add("String " + count);
        }
        else {
            throw new Failure2("Exception2: ");
        }
        if (count == 0)
            throw new Failure1("Exception1: ");
    }
}