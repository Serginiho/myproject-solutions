package com.homecompany.chapter17.exercise13;

import util.TextFile;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AssociativeArray<K,V> {
    private Object[][] pairs;
    private int index;
    AssociativeArray(int length){
        pairs = new Object[length][2];
    }
    public void put (K key, V value){
        if (index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException("Too much element");
            pairs[index++] = new Object[]{key, value};

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if (i < index-1)
                result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> words = new TextFile("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter17/exercise12/MapTest.java",
                "\\W+");
        System.out.println(words);
        Set<String> uniqewords = new TreeSet<>(words);
        System.out.println(uniqewords);
        AssociativeArray<String, Integer> array = new AssociativeArray<>(uniqewords.size());
        for (String s:
             uniqewords) {
            int count =0;
            for (String t:
                 words) {
                if(s.equals(t))
                    count++;
            }
            array.put(s, count);
        }
        System.out.println(array);
    }
}
