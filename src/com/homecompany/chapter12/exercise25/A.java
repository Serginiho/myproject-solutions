package com.homecompany.chapter12.exercise25;

class A {
    void methodA () throws FirstException {
        System.out.println("Method class A");
        throw new FirstException();
    }
}
