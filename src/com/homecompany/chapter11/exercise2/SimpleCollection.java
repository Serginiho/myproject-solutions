package com.homecompany.chapter11.exercise2;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> b = new HashSet<>();
 //       Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++)
            b.add(i);
        for (Integer i: b)
            System.out.print(i + ", ");
    }
}