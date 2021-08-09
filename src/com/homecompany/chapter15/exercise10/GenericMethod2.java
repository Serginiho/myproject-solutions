package com.homecompany.chapter15.exercise10;

import com.homecompany.generics.Americano;

class GenericMethod2 {
    <A,B> void f(A a, B b, double c) {
        System.out.println("a: " + a.getClass().getName() + ", b: " + b.getClass().getName() + ", c: " + c);
    }
    public static void main (String[] args){
        GenericMethod2 gm = new GenericMethod2();
        gm.f(gm,new Americano(),2.4 );
    }
}
