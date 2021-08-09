package com.homecompany.chapter14.exercise3;

public class Rhomboid extends Shape{
    boolean flag=false;
    @Override
    public String toString() {
        return flag ? "Rhomboid (highlighted)" : "Rhomboid";
    }
}
