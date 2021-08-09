package com.homecompany.chapter11.exercise24;

import util.TextFile;

import java.util.*;

class StringMap {
    public static void main (String[] args){
        Map<String, String> stringMap = new LinkedHashMap<>();
        List<String> keyString = new LinkedList<>(new TextFile("src/com/homecompany/eleventhchapter/exercise22/UniqueWordsByClass.java", "\\W+"));
        List<String> valueString = new LinkedList<>(new TextFile("src/com/homecompany/eleventhchapter/exercise23/Statistics23.java", "\\W+"));
        System.out.println(keyString);
        System.out.println(valueString);
        ListIterator<String> itKey = keyString.listIterator();
        ListIterator<String> itValue = valueString.listIterator();
        while (itKey.hasNext()){
            String s = itKey.next();
            String t = itValue.next();
            stringMap.put(s,t);
        }
        System.out.println("Not sort map: " + stringMap);
        Set<String> sortKey = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        sortKey.addAll(stringMap.keySet());
//        System.out.println(sortKey);
        Map<String, String> stringMap2 = new LinkedHashMap<>();
        for (String s:
             sortKey) {
            stringMap2.put(s, stringMap.get(s));
        }
        stringMap.clear();
        stringMap.putAll(stringMap2);
        System.out.println("Sort map: " + stringMap);
        }
}
