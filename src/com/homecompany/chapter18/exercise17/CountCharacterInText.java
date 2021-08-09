package com.homecompany.chapter18.exercise17;

import util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountCharacterInText {
    public static void main(String[] args) {
        TextFile text = new TextFile("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/" +
                "chapter18/exercise16/UsingRandomAccessFile.java", "\\s+");
        ArrayList<Character> characters = new ArrayList<>();
        char[] character;
        for (String s:
             text) {
            character = s.toCharArray();
            for (char c:
                 character) {
                characters.add(c);
            }
        }
        System.out.println("Input file: " + text);
        System.out.println("------------------------------");
        System.out.println("Characters from the input file: " + characters);
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c:
             characters) {
            int count = charCount.get(c)==null ? 0 : charCount.get(c);
                charCount.put(c, count == 0 ? 1 : ++count);
        }
        System.out.println("------------------------------");
        System.out.println("Count characters from words in the input file:");
        for (Map.Entry<Character, Integer> me:
                charCount.entrySet()) {
            System.out.println("'" +me.getKey() + "'" + " = " + me.getValue());
        }
    }
}
