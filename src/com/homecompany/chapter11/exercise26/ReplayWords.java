package com.homecompany.chapter11.exercise26;

import util.TextFile;

import java.util.*;

public class ReplayWords {
    public static void main (String[] args) {
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
        System.out.println(countWords);
        Map<Integer, String> replay = new TreeMap<>();
        Iterator<Map.Entry<String, ArrayList<Integer>>> itR = countWords.entrySet().iterator();
        while (itR.hasNext()){
            Map.Entry<String, ArrayList<Integer>> entry = itR.next();
            for (int i = 0; i < entry.getValue().size(); i++) {
                replay.put(entry.getValue().get(i),entry.getKey());
            }
        }
        System.out.println(replay);
    }
}
