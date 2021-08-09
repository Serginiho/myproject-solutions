package com.homecompany.chapter11.exercise18;

import com.homecompany.chapter11.exercise4.NameGenerator;

import java.util.*;


class MyMap {
    public static void main(String[] args){
        NameGenerator ng = new NameGenerator();
        Map<Integer, String> integerStringMap = new HashMap<>();
        for (int i = 1; i<99;i+=10)
        integerStringMap.put(i,ng.next());
        System.out.println(integerStringMap);
/*        Map<Integer,String> sortedMap = integerStringMap.entrySet().stream().sorted(comparingByKey()).collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(sortedMap);*/
        Set<Integer> sortedKey = new TreeSet<>(integerStringMap.keySet());
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Integer i: sortedKey)
            sortedMap.put(i, integerStringMap.get(i));
        System.out.println(sortedMap);
    }
}
