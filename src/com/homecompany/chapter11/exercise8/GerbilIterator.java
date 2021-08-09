package com.homecompany.chapter11.exercise8;

import com.homecompany.chapter11.exercise1.Gerbil;

import java.util.Iterator;

public class GerbilIterator {
    public static void displayGerbil (Iterator<Gerbil> itG){
        while (itG.hasNext()){
            Gerbil g = itG.next();
            System.out.println("Gerbil: " + g.gerbilNumber);
        }
    }
}
