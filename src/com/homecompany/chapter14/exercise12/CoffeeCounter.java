package com.homecompany.chapter14.exercise12;

import com.homecompany.generics.Coffee;
import com.homecompany.generics.CoffeeGenerator;
import util.TypeCounter;

public class CoffeeCounter {
    public static void main (String[] args){
        TypeCounter counter = new TypeCounter(Coffee.class);
        for (Coffee c: new CoffeeGenerator(20)) {
            System.out.print(c.getClass().getSimpleName() + " ");
            counter.count(c);
        }
        System.out.println();
        System.out.println(counter);
    }
}
