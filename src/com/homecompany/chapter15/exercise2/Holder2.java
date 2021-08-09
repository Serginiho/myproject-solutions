package com.homecompany.chapter15.exercise2;

import com.homecompany.typeinfo.pets.*;

public class Holder2<T> {
    private T obj1;
    private T obj2;
    private T obj3;
    public Holder2 (T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    void set (T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    T getObj1 () {return obj1;}
    T getObj2 () {return obj2;}
    T getObj3 () {return obj3;}
    public static void main (String[] args){
        Holder2<Pet> h2 = new Holder2<>(new Cymric("Tic"), new Gerbil("Tac"), new Hamster("Toe"));
        System.out.println(h2.getObj1() + ", " + h2.getObj2() + ", " + h2.getObj3());
        h2.set(new Dog(), new Cat(), new Rodent());
        System.out.println(h2.getObj1() + ", " + h2.getObj2() + ", " + h2.getObj3());
    }
}
