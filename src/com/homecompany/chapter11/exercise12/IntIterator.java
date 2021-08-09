package com.homecompany.chapter11.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class IntIterator {
    public static void main (String[] args) {
        List p = new ArrayList<>();
            for (int i = 0; i < 10; i++)
                p.add(i);
        System.out.println("p: " + p);
        List<Integer> p2 = new ArrayList<>(10);
        System.out.println("Ver1 p2: " + p2);
        ListIterator it1 = p.listIterator(10);
        ListIterator<Integer> it2 = p2.listIterator();
        while (it1.hasPrevious()){
            int c = (int) it1.previous();
            it2.add(c);
            }
        System.out.print("Ver2 p2: " + p2);
    }
}
