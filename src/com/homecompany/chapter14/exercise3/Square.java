package com.homecompany.chapter14.exercise3;

public class Square extends Shape{
    boolean flag = false;
    @Override
    public String toString() {
        return flag ? "Square (highlighted)" : "Square";
    }
}
