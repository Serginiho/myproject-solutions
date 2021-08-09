package com.homecompany.chapter14.exercise3;

public class Circle extends Shape{
    boolean flag = false;
    @Override
    public String toString() {
        return flag ? "Circle (highlighted)" : "Circle";
    }
}
