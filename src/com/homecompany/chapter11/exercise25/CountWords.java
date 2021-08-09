package com.homecompany.chapter11.exercise25;

import util.TextFile;

import java.util.*;

class CountWords {
    public static void main (String[] args){
        Map<String, ArrayList<Integer>> countWords = new LinkedHashMap<>();
        List<String> wordForRead = new LinkedList<>(new TextFile("src/com/homecompany/eleventhchapter/exercise23/Statistics23.java", "\\W+"));
        System.out.println(wordForRead);
        Iterator<String> itWords = wordForRead.iterator();
        int count = 0;
        while(itWords.hasNext()) {
            String s = itWords.next();
            count++;
            if(!countWords.containsKey(s)) {
                ArrayList<Integer> ai =
                        new ArrayList<>();
                ai.add(0, count);
                countWords.put(s, ai);
            }
            else {
                countWords.get(s).add(count);
                countWords.put(s, countWords.get(s));
            }
        }
        System.out.println("My try: " + countWords);
    }
}
