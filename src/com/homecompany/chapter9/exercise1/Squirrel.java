package com.homecompany.chapter9.exercise1;

class Squirrel implements Rodent{
    @Override
    public void eat() {
        System.out.println("Squirrel eats nuts");
    }

    @Override
    public void move() {
        System.out.println("Squirrel jumps on tree");
    }
}
