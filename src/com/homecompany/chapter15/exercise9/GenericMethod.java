package com.homecompany.chapter15.exercise9;

import com.homecompany.typeinfo.pets.Mutt;

class GenericMethod {
    <A,B,C> void f(A a, B b, C c) {
        System.out.println("a: " + a.getClass().getName() + ", b: " + b.getClass().getName() + ", c: " + c.getClass().getName());
    }
    public static void main (String[] args){
        GenericMethod gm = new GenericMethod();
        gm.f(2, "String", new Mutt());
    }
}
