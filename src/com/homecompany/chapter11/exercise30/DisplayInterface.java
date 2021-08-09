package com.homecompany.chapter11.exercise30;

import com.homecompany.typeinfo.pets.Pet;

import java.util.Collection;
import java.util.Iterator;

public class DisplayInterface {
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display (Collection<Pet> pets){
        for (Pet p: pets){
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
}
