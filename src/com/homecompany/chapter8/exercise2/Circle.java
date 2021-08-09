package com.homecompany.chapter8.exercise2;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
    @Override
    public void edit() {
        System.out.println("Circle.edit()");
    }
}
