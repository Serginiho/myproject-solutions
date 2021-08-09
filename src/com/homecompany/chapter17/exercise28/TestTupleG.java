package com.homecompany.chapter17.exercise28;

import util.Generated;
import util.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class TestTupleG {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(Generated.array(new String[7],
                new RandomGenerator.String())));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(Generated.array(new Integer[7],
                new RandomGenerator.Integer())));
        List<Character> characterList = new ArrayList<>(Arrays.asList(Generated.array(new Character[7],
                new RandomGenerator.Character())));
        Random random = new Random();
        TupleG.T2<Integer, String> t2 = new TupleG.T2<>(integerList.get(random.nextInt(7)),
                stringList.get(random.nextInt(7)));
        TupleG.T3<Integer, String, Character> t3 = new TupleG.T3<>(integerList.get(random.nextInt(7)),
                stringList.get(random.nextInt(7)), characterList.get(random.nextInt(7)));
        TupleG.T4<String, String, String, String> t4 = new TupleG.T4<>(stringList.get(random.nextInt(7)),
                stringList.get(random.nextInt(7)),
                stringList.get(random.nextInt(7)), stringList.get(random.nextInt(7)));
        TupleG.T5<Integer, Integer, Integer, Integer, Integer> t5 = new TupleG.T5<>(random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),random.nextInt(100),random.nextInt(100));
        TupleG.T6<Integer, Integer, Integer, Integer, Integer, Integer> t6 = new TupleG.T6<>(random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),random.nextInt(100),random.nextInt(100),
                integerList.get(random.nextInt(7)));
        TupleG.T5<Integer,Integer,Integer,Integer,Integer> t5_1 = TupleG.tuple(random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),random.nextInt(100),random.nextInt(100));
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t5_1);
        System.out.println(t6);
        System.out.println(t5.compareTo(t5_1));
    }
}
