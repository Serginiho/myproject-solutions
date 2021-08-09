package com.homecompany.chapter14.exercise3;

public abstract class Shape {
    public void draw () {System.out.println(this + ".draw()");}
    public static void rotate (Shape shape){
        if(!(shape instanceof Circle)){
            System.out.println(shape + ".rotate()");
        }
    }
    public static void highlight (Shape shape){
        if(shape instanceof Circle)
            ((Circle) shape).flag = true;
    }
    abstract public String toString();
}
