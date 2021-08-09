package com.homecompany.chapter14.exercise3;

public class Triangle extends Shape{
    boolean flag = false;
    @Override
    public String toString() {
        return flag ? "Triangle (highlighted)" : "Triangle";
    }
}
