package com.homecompany.chapter8.exercise2;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
    @Override
    public void edit() {
        System.out.println("Triangle.edit()");
    }
}
