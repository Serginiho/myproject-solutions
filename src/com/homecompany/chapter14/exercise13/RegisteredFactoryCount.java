package com.homecompany.chapter14.exercise13;

import com.homecompany.factory.Part;
import util.TypeCounter;

import java.util.ArrayList;
import java.util.List;

public class RegisteredFactoryCount {
    public static void main (String[] args){
        TypeCounter counter = new TypeCounter(Part.class);
        List<Part> c = new ArrayList<>();
        for (int i = 0; i<20; i++){
            c.add(Part.createRandom());
        }
        for (Part p: c){
            System.out.print(p + " ");
            counter.count(p);
        }
        System.out.println();
        System.out.println(counter);
    }
}
