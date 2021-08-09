package com.homecompany.chapter11.exercise1;

import com.homecompany.chapter11.exercise8.GerbilIterator;

import java.util.ArrayList;
import java.util.Collection;

public class Gerbil {
    public final int gerbilNumber;
    public Gerbil (int i){
        this.gerbilNumber = i;
    }
    public Integer hop (){
        return gerbilNumber;
    }
    public static void hop (Collection<Gerbil> e) {
        GerbilIterator.displayGerbil(e.iterator());
    }
    public static void main (String[] args){
        ArrayList <Gerbil> gerbil = new ArrayList<>();
        for (int i = 1; i<6; i++)
            gerbil.add(new Gerbil(i));
        hop(gerbil);
/*        for (int j = 0; j < gerbil.size(); j++)
            gerbil.get(j).hop();*/
        }
    }
