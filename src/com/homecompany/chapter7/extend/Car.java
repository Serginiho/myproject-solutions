package com.homecompany.chapter7.extend;

public class Car extends Engine {
    public Engine engine = new Engine();
    public void turnKey (){
        start();
    }
    public static void main (String[] args){
        Car car = new Car();
        car.engine.service();
        car.turnKey();
    }
}
