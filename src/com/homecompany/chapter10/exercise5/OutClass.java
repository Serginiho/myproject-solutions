package com.homecompany.chapter10.exercise5;

public class OutClass {
    public static void main (String[] args){
        ClassBasic cb = new ClassBasic();
        ClassBasic.InClassBasic icb = cb.new InClassBasic();
        ClassBasic cb2 = icb.getClassBasic();
        System.out.println(cb2.getClass().getSimpleName());
    }
}
