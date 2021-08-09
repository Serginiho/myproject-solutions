package com.homecompany.chapter11.exercise19;

import com.homecompany.chapter11.exercise4.NameGenerator;

import java.util.*;
import java.util.stream.Collectors;

class MyMap2 {
    public static void main(String[] args) {
        NameGenerator ng = new NameGenerator();
        Map<Integer, String> integerStringMap = new HashMap<>();
        for (int i = 1; i < 99; i += 10)
            integerStringMap.put(i, ng.next());
        System.out.println(integerStringMap);
        Set<Integer> key = new HashSet<>(integerStringMap.keySet());
        Set<Integer> sortedKey = key.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Integer i: sortedKey)
            sortedMap.put(i, integerStringMap.get(i));
        System.out.println(sortedMap);
    }
}
