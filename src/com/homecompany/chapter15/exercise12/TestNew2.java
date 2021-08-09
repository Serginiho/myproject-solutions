package com.homecompany.chapter15.exercise12;

import com.homecompany.generics.Coffee;
import com.homecompany.generics.CoffeeGenerator;
import util.New;

import java.util.LinkedList;

class TestNew2 {
    static void f (LinkedList<Coffee> list){
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i=0; i<5; i++){
            list.add(gen.next());}
        for (Coffee c : list)
            System.out.println(c);
    }
    public static void main (String[] args){
        f(New.lList());
    }
}
