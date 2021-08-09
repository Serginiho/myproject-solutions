package com.homecompany.chapter5;

public class Constriction {

    Constriction (String x, int p){
        this(p,x);
        System.out.println(p + " " + x);

    }
    Constriction (int p, String x){
        p = 10;
        x = "string";
    }
}
