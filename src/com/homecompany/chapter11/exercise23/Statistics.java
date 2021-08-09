package com.homecompany.chapter11.exercise23;

import java.util.*;

class Statistics {
    public static void main (String[] args){
        Random rand = new Random();
        Map<Integer, Integer> cycleTest = new TreeMap<>();
        for (int j = 1; j < 2000; j++) {
            Map<Integer, Integer> testMap = new TreeMap<>();
            for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = testMap.get(r);
            testMap.put(r, freq == null? 1 : freq+1);
            }
            Integer max = Collections.max(testMap.values());
            for (Map.Entry<Integer, Integer> entry: testMap.entrySet()) {
                if (entry.getValue().equals(max)){
                    Integer freqCycle = cycleTest.get(entry.getKey());
                    cycleTest.put(entry.getKey(), freqCycle == null ? 1: freqCycle+1);
                }
            }
 //           System.out.println("Candidats for Max after " + j +" cycle tests: " + cycleTest);
 //           System.out.println("Map of stat: " + testMap);
        }
        System.out.println("Most appears: " + cycleTest);
 /*       Integer maxCycle = Collections.max(cycleTest.values());
        for (Map.Entry<Integer, Integer> entry:
                cycleTest.entrySet()) {
            if (entry.getValue().equals(maxCycle))
                System.out.println("Random number: " + entry.getKey() + ", Max: " + entry.getValue());
        }*/
    }
}
