package com.homecompany.chapter11.exercise20;

import util.TextFile;

import java.util.*;

class MapOfVowels {
    public static void main(String[] args) {
        SortedSet<Character> vowelsSet = new TreeSet<>();
        Collections.addAll(vowelsSet, 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y');
        System.out.println(vowelsSet);
        Set<String> words = new TreeSet<>(new TextFile("src/com/homecompany/eleventhchapter/exercise20/SetOperation.java", "\\W+"));
        System.out.println(words);
        System.out.println("Total count of words: " + words.size());
//        int count = 0;
        int allVowelsCount = 0;
        int charWords = 0;
        Map<Character, Integer> vowels = new TreeMap<>();
        for (String s : words) {
            char[] word = s.toCharArray();
//            System.out.println("Word: " + Arrays.toString(word));
            for (char c : word) {
                if (vowelsSet.contains(c)) {
                    Integer count = vowels.get(c);
                    vowels.put(c, count == null ? 1 : count+1);
 //                   System.out.println(c + " is vowels");
                    allVowelsCount++;
                }
 //               else {System.out.println(c + " is not vowels");}
                charWords++;
            }
//            int countVowels = count;
//            System.out.println("Count of vowels in word: " + countVowels);
//            count = 0;
        }
        System.out.println(vowels);
        System.out.println("All vowels in text is " + allVowelsCount);
        System.out.println("Percent of all vowels in text is " + ((allVowelsCount*100)/ charWords) + "%");
}
}
