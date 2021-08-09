package com.homecompany.chapter11.exercise10;

class Mouse implements Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse eats cheese");
    }

    @Override
    public void move() {
        System.out.println("Mouse runs");
    }
}
