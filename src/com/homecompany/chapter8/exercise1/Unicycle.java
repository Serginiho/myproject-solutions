package com.homecompany.chapter8.exercise1;

public class Unicycle extends Cycle {
    private int wheels = 1;
    @Override
    public void ride (Cycle c){
        System.out.println("Unicycle.ride()"+ ", Wheels: " + c.wheels());
    }

    @Override
    public int wheels() {
        return this.wheels;
    }
    public void balance (){
        System.out.println("Unicycle.balance()");
    }
}
