package com.homecompany.chapter9.exercise6;

public class RunableClass {
    static void f1(Inter1 i1){
        i1.saw();
        i1.say();
    }
    static void f2(Inter2 i2){
        i2.screen();
        i2.show();
    }
    static void f3(Inter3 i3){
        i3.put();
        i3.set();
    }
    static void f4(Inter4 i4){
        i4.pickUp();
    }
    public static void main (String[] args){
        ClassFromBasic cfb = new ClassFromBasic();
//        BasicClass bc = new BasicClass();
//        f1((ClassFromBasic)bc);
        f1(cfb);
        f2(cfb);
        f3(cfb);
        f4(cfb);
    }
}
