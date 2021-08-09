package com.homecompany.chapter17.exercise10;

import com.homecompany.chapter16.exercise1.SimpleBerylliumSphere;
import util.Generated;
import util.RandomGenerator;

import java.util.Arrays;

class TestMSS {
    public static void main(String[] args) {
        MySortedSet<String> mySortedSet = new MySortedSet<>(Arrays.asList("A S D F G H J K L Q W E R T Y U I O P Z X C V B N M".split(" ")));
        System.out.println(mySortedSet);
        System.out.println(mySortedSet.size());
        System.out.println(mySortedSet.first());
        System.out.println(mySortedSet.last());
        System.out.println(mySortedSet.subSet("D", "T"));
        System.out.println(mySortedSet.headSet("S"));
        System.out.println(mySortedSet.tailSet("Y"));
        MySortedSet<Integer> integerMySortedSet = new MySortedSet<>(Arrays.asList(Generated.array(new Integer[20], new RandomGenerator.Integer())));
        System.out.println(integerMySortedSet);
        System.out.println(integerMySortedSet.size());
        System.out.println(integerMySortedSet.first());
        System.out.println(integerMySortedSet.last());
        System.out.println(integerMySortedSet.subSet(4589, 7278));
        System.out.println(integerMySortedSet.headSet(8288));
        System.out.println(integerMySortedSet.tailSet(4861));
        integerMySortedSet.addItem(2);
        integerMySortedSet.addItem(10000);
        System.out.println(integerMySortedSet);
        MySortedSet<SimpleBerylliumSphere> mss = new MySortedSet<>();
        for (int i = 0; i < 10; i++) {
            mss.addItem(new SimpleBerylliumSphere());
        }
        System.out.println(mss);
        System.out.println(mss.size());
        System.out.println(mss.first());
        System.out.println(mss.last());
    }
}
