package com.homecompany.chapter15.exercise36;

import java.util.ArrayList;
import java.util.List;

class ProcessRunner<T, E1 extends Exception, E2 extends Exception> extends ArrayList<Processor<T, E1, E2>> {
    List<T> processAll() throws E1, E2 {
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T, E1, E2> processor:
             this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}
