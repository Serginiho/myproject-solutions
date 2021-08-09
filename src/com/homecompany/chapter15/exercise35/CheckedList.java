package com.homecompany.chapter15.exercise35;

import com.homecompany.generics.*;
import com.homecompany.typeinfo.pets.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldMethod (List probablyCoffee){
        probablyCoffee.add(new Cat());
    }

    public static void main(String[] args) {
        List<Americano> americanoList = new ArrayList<>();
        oldMethod(americanoList);
        System.out.println(americanoList);
        List<Latte> latteList = Collections.checkedList(new ArrayList<>(), Latte.class);
        try {
            oldMethod(latteList);
        } catch (Exception e) {
            System.err.println(e);
        }
        List<Coffee> coffees = Collections.checkedList(new ArrayList<>(), Coffee.class);
        coffees.add(new Mocha());
        coffees.add(new Latte());
        coffees.add(new Cappuccino());
        coffees.add(new Americano());
        System.out.println(coffees);
    }
}
