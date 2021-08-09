package com.homecompany.chapter5;

class ThisClass {
    void f(){
        f1();
        this.f1();
    }
    void f1(){
        System.out.println("This - работает");
    }
}
