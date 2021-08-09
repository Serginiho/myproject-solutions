package com.homecompany.chapter11.exercise22;

import util.TextFile;

import java.util.*;

class UniqueWordsByClass {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("src/com/homecompany/eleventhchapter/exercise21/UniqueWords.java", "\\W+"));
        words.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        Set<MapWords> mw3 = new LinkedHashSet<>();
        MapWords mw = new MapWords();
        for (String f:
             words) {
            mw.put(f);
            mw3.add(mw);
        }
        System.out.println("Map of words 1= " + mw3);
        Set<Word> mw2 = new LinkedHashSet<>();
        Iterator<String> it = words.listIterator();
        while (it.hasNext()){
            String s = it.next();
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (s.equals(words.get(i))) count++;
            }
            Word w = new Word(s, count);
            mw2.add(w);
        }
        System.out.println("Map of words 2= " + mw2);
        System.out.println(Word.totalCountW);
    }
}
