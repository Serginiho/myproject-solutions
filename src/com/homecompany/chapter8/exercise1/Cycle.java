package com.homecompany.chapter8.exercise1;

class Cycle {
    int wheels = 0;
    public void ride (Cycle c){
        System.out.println("Cycle.ride()"+ ", Wheels: " + c.wheels());
    }
    public int wheels (){return this.wheels;}
}
