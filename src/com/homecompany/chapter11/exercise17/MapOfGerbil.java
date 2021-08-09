package com.homecompany.chapter11.exercise17;

import com.homecompany.chapter11.exercise1.Gerbil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class MapOfGerbil {
    public static void main (String[] args){
        Random rand = new Random();
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Tima",new Gerbil(rand.nextInt(10)));
        gerbilMap.put("Toma", new Gerbil(rand.nextInt(10)));
        gerbilMap.put("Cruz", new Gerbil(rand.nextInt(10)));
        gerbilMap.put("Geralt", new Gerbil(rand.nextInt(10)));
        System.out.println(gerbilMap);
        Iterator<String> it = gerbilMap.keySet().iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + ": ");
            System.out.println(gerbilMap.get(s).hop());
        }
    }
}
