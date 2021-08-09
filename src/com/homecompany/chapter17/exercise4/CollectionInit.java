package com.homecompany.chapter17.exercise4;

import util.TextFile;

import java.util.ArrayList;
import java.util.Collection;

class CollectionInit {
    static Collection<String> textToWordsArray (String file, String regax) {
        ArrayList<String> words = new ArrayList<>(new TextFile(file, regax));
        return words;
    }
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Use file");
            System.exit(1);
        }
//        Set<String> wordsInFile = new LinkedHashSet<>(new TextFile(args[0], "\\W+"));
//        System.out.println("Words in file: " + wordsInFile);
        System.out.println(textToWordsArray(args[0],"\\W+" ));
    }
}
