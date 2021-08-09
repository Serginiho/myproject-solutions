package com.homecompany.chapter11.exercise5;

import java.util.*;

class ListFeaturesInt {
    public static void main (String[] args){
        Random rand = new Random();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            intList.add(i,rand.nextInt(50));
        System.out.println("1: " + intList);
        int h = 100;
        intList.add(h);
        System.out.println("2: " + intList);
        System.out.println("3: " + intList.contains(100));
        intList.remove(5);
        int p = intList.get(2);
        System.out.println("4: " + p + " " + intList.indexOf(p));
        int c = 1000;
        System.out.println("5: " + intList.indexOf(c));
//        System.out.println("6: " + intList.remove(c));
        System.out.println("7: " + intList.remove(2));
        System.out.println("8: " + intList);
        intList.add(3, 2000);
        System.out.println("9: " + intList);
        List<Integer> sub = intList.subList(1,4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + intList.contains(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("11: " + intList.containsAll(sub));
        Collections.shuffle(sub,rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + intList.containsAll(sub));
        List<Integer> copy = new ArrayList<>(intList);
        sub = Arrays.asList(intList.get(1),intList.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(intList);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + sub);
        copy.set(1, 3000);
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + intList.isEmpty());
        intList.clear();
        System.out.println("19: " + intList);
        System.out.println("20: " + intList.isEmpty());
        intList.addAll(0, copy);
        System.out.println("21: " + intList);
        Object[] o = intList.toArray();
        System.out.println("22: " + o[3]);
    }
}
