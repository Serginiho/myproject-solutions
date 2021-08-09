package com.homecompany.chapter9.exercise8;

public class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
