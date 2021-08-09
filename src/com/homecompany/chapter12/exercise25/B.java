package com.homecompany.chapter12.exercise25;

class B extends A{
    @Override
    void methodA() throws SecondException {
        System.out.println("Method class B");
        throw new SecondException();
    }
}
