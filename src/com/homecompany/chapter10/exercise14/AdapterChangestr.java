package com.homecompany.chapter10.exercise14;

class AdapterChangestr extends Changestr implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return changeStr((String)input);
    }
}
