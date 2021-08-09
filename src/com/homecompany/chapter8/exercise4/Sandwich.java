package com.homecompany.chapter8.exercise4;
// упражнение 11
public class Sandwich extends Lunch implements Preparable{
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Pickle p = new Pickle();
    @Override
    public void cook() {
        System.out.println("Sandwich is ready");
    }
    Sandwich (){System.out.println("Конструктор Sandwich()");}
    public static void main (String[] args){
        new Sandwich().cook();
    }
}
