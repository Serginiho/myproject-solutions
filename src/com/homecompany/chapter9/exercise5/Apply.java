package com.homecompany.chapter9.exercise5;

public class Apply {
    public static void process (Processor p, Object s){
        System.out.println("Using Processor: " + p.name());
        System.out.println(p.process(s));
    }
}
