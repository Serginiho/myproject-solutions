package com.homecompany.chapter15.exercise11;

import com.homecompany.generics.Americano;
import com.homecompany.generics.Cappuccino;
import com.homecompany.generics.Coffee;
import util.New;

import java.util.Map;

class TestNew{
    public static void main (String[] args){
        Map<String, Coffee> m = New.map();
        m.put("First", new Americano());
        m.put("Second", new Cappuccino());
        for (Map.Entry<String, Coffee> entry:
             m.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
