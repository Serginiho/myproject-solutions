package com.homecompany.chapter8.exercise1;

public class Bicycle extends Cycle {
    private int wheels = 2;
    @Override
    public void ride (Cycle c){
        System.out.println("Bicycle.ride()"+ ", Wheels: " + c.wheels());
    }

    @Override
    public int wheels() {
        return this.wheels;
    }

    public void balance (){
        System.out.println("Bicycle.balance()");
    }
}
