package com.homecompany.chapter9.exercise1;

class Hamster implements Rodent{
    @Override
    public void eat() {
        System.out.println("Hamster eats cabbage");
    }

    @Override
    public void move() {
        System.out.println("Hamster runs in wheel");
    }
}
