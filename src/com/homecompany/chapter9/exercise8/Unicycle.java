package com.homecompany.chapter9.exercise8;

class Unicycle implements Cycle{
    private int wh = 1;
    @Override
    public void ride() {
        System.out.println("Unicycle.ride()"+ ", Wheels: " + wheels());
    }

    @Override
    public int wheels() {
        return this.wh;
    }
}
