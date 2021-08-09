package com.homecompany.chapter17.exercise9;

import util.Generated;
import util.RandomGenerator;

import java.util.*;

class SortedSetTest {
    public static void main(String[] args) {
        String [] s = Generated.array(new String[10], new RandomGenerator.String());
        List<String> arrayList = new ArrayList<>(Arrays.asList(s));
        SortedSet<String> alphabetic = new TreeSet<>(Arrays.asList("A S D F G H J K L Q W E R T Y U I O P Z X C V B N M".split(" ")));
        SortedSet<String> stringSet = new TreeSet<>(arrayList);
        System.out.println(alphabetic);
        System.out.println(stringSet);
    }
}
