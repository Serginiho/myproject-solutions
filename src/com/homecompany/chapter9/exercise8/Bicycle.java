package com.homecompany.chapter9.exercise8;

class Bicycle implements Cycle{
    private int wh2 = 2;
    @Override
    public void ride() {
        System.out.println("Bicycle.ride()"+ ", Wheels: " + wheels());
    }

    @Override
    public int wheels() {
        return this.wh2;
    }
}
