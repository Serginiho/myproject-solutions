package com.homecompany.chapter9.exercise1;

class Mouse implements Rodent{
    @Override
    public void eat() {
        System.out.println("Mouse eats cheese");
    }

    @Override
    public void move() {
        System.out.println("Mouse runs");
    }
}
