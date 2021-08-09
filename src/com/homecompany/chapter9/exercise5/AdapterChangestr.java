package com.homecompany.chapter9.exercise5;

class AdapterChangestr extends Changestr implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return changeStr((String)input);
    }
}
