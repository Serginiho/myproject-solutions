package com.homecompany.chapter9.exercise8;

class Tricycle implements Cycle{
    private int wh3 = 3;

    @Override
    public void ride() {
        System.out.println("Tricycle.ride()"+ ", Wheels: " + wheels());
    }

    @Override
    public int wheels() {
        return this.wh3;
    }
}
