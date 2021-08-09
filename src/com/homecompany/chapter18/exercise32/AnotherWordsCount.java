package com.homecompany.chapter18.exercise32;

import com.homecompany.chapter18.exercise31.Person;
import nu.xom.Document;
import nu.xom.Element;
import util.TextFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnotherWordsCount {
    public static void main(String[] args) throws IOException {
        if (args.length == 0){
            System.out.println();
            System.exit(0);
        }
        ArrayList<String> words = new TextFile(args[0], "\\W+");
        System.out.println(words);
        Map<String,Integer> wordsCount = new HashMap<>();
        for (String word:
             words) {
            Integer quantity = wordsCount.get(word);
            wordsCount.put(word, quantity == null ? 1 : ++quantity);
        }
        System.out.println(wordsCount);
        Element root = new Element("words");
        String [] keys = new String[wordsCount.keySet().size()];
        wordsCount.keySet().toArray(keys);
        for (int i = 0; i < keys.length; i++) {
            Element word = new Element("word_" +i);
            Element count = new Element("quantity_of_word_" + i);
            Element name = new Element("name_of_word_" +i);
            root.appendChild(word);
            word.appendChild(name);
            word.appendChild(count);
            name.appendChild(keys[i]);
            count.appendChild(String.valueOf(wordsCount.get(keys[i])));
        }
        Document doc = new Document(root);
        Person.format(System.out, doc);
        Person.format(new BufferedOutputStream(new FileOutputStream("WordsCount.xml")), doc);
    }
}
