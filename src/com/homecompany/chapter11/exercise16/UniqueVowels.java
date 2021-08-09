package com.homecompany.chapter11.exercise16;

import java.util.*;

class UniqueVowels {
    public static void main(String[] args) {
        SortedSet<Character> vowelsSet = new TreeSet<>();
        Collections.addAll(vowelsSet, 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y');
        System.out.println(vowelsSet);
        List<String> words = new LinkedList<>(Arrays.asList(("public class SetOperation { public static void main ( String [] args ) { " +
                "Set < String > set1 = new HashSet <> (); " +
                "Collections . addAll ( set1 ,\" A B C D E F G H I J K L \" . split (\" \")); " +
                "set1 . add (\" M \"); " +
                "System . out . println (\" H :\" + set1 . contains (\" H \")); " +
                "System . out . println (\" N :\" + set1 . contains (\" N \")); " +
                "Set < String > set2 = new HashSet <>(); " +
                "Collections . addAll ( set2,\" H I J K L \" . split (\" \")); " +
                "System . out . println (\" set2 in set1 : \" + set1 . containsAll ( set2 )); " +
                "set1 . remove (\" H \"); " +
                "System . out . println (\" set1 : \" + set1 ); " +
                "System . out . println (\" set2 in set1 : \" + set1 . containsAll ( set2 )); " +
                "set1 . removeAll ( set2 ); " +
                "System . out . println (\" set2 removed from set1 : \" + set1 ); " +
                "Collections . addAll ( set1, \" X Y Z \" . split ( \" \")); " +
                "System . out . println (\" ' X Y Z ' added to set1 : \" + set1 );}}").split(" ")));
        words.sort(String::compareToIgnoreCase);
        List<String> subWords = new LinkedList<>(words.subList(99, (words.size()-2)));
        System.out.println(subWords);
        System.out.println("Total count of words: " + subWords.size());
        int count = 0;
        int allVowelsCount = 0;
        int charWords = 0;
        for (String s : subWords) {
            char[] word = s.toCharArray();
            System.out.println("Word: " + Arrays.toString(word));
            for (char c : word) {
                if (vowelsSet.contains(c)) {
                    count++;
                    System.out.println(c + " is vowels");
                    allVowelsCount++;
                }else {System.out.println(c + " is not vowels");}
                charWords++;
            }
            int countVowels = count;
            System.out.println("Count of vowels in word: " + countVowels);
            count = 0;
        }
        System.out.println("All vowels in text is " + allVowelsCount);
        System.out.println("Percent of all vowels in text is " + ((allVowelsCount*100)/ charWords) + "%");
    }
}