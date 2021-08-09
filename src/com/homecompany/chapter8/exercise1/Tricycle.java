package com.homecompany.chapter8.exercise1;

public class Tricycle extends Cycle {
    private int wheels = 3;
    @Override
    public void ride (Cycle c){
        System.out.println("Tricycle.ride()" + ", Wheels: " + c.wheels());
    }

    @Override
    public int wheels() {
        return this.wheels;
    }
}
