package com.homecompany.chapter8.exercise2;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
    @Override
    public void edit() {
        System.out.println("Square.edit()");
    }
}
