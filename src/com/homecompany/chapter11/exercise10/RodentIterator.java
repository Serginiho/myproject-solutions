package com.homecompany.chapter11.exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class RodentIterator {
    public static void main(String[] args) {
        List<Rodent> r = new ArrayList<>();
        r.add(new Mouse());
        r.add(new Hamster());
        r.add(new Squirrel());
        ListIterator<Rodent> rodentListIterator = r.listIterator();
        while (rodentListIterator.hasNext()) {
            Rodent rodent = rodentListIterator.next();
            rodent.eat();
            rodent.move();
        }
        }
    }


