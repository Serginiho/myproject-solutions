package com.homecompany.chapter11.exercise6;

import com.homecompany.chapter11.exercise4.NameGenerator;

import java.util.*;

class ListFeaturesStr {
    public static void main (String[] args){
        Random rand = new Random();
        List<String> stringList = new ArrayList<>();
        NameGenerator.fill(stringList, 5);
        System.out.println("1: " + stringList);
        String h = "Jhon";
        stringList.add(h);
        System.out.println("2: " + stringList);
        System.out.println("3: " + stringList.contains(h));
        stringList.remove(h);
        String p = stringList.get(2);
        System.out.println("4: " + p + " " + stringList.indexOf(p));
        String c = "Mom";
        System.out.println("5: " + stringList.indexOf(c));
        System.out.println("6: " + stringList.remove(c));
        System.out.println("7: " + stringList.remove(p));
        System.out.println("8: " + stringList);
        stringList.add(3, "Irina");
        System.out.println("9: " + stringList);
        List<String> sub = stringList.subList(1,4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + stringList.contains(sub.get(1)));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("11: " + stringList.containsAll(sub));
        Collections.shuffle(sub,rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + stringList.containsAll(sub));
        List<String> copy = new ArrayList<>(stringList);
        sub = Arrays.asList(stringList.get(1),stringList.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(stringList);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + sub);
        copy.set(1, "Sergey");
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + stringList.isEmpty());
        stringList.clear();
        System.out.println("19: " + stringList);
        System.out.println("20: " + stringList.isEmpty());
        stringList.addAll(0, copy);
        System.out.println("21: " + stringList);
        Object[] o = stringList.toArray();
        System.out.println("22: " + o[3]);
    }
}
