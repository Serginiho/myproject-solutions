package com.homecompany.chapter18.exercise10;

import com.homecompany.chapter18.exercise7.ReadInLinkedList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadInLLByWords {
    public static List<String> readByWords (String[] args) throws IOException {
        if(args.length < 1) {
            System.out.println("input file name and words for search in command line");
            return new LinkedList<>();
        } else if (args.length == 1){
            return ReadInLinkedList.read(args[0]);
        }
        List<String> list = new LinkedList<>();
        Pattern p;
        for (int i = 1; i < args.length; i++) {
            p = Pattern.compile(".*" + args[i] + ".*");
            for (String s:
                    ReadInLinkedList.read(args[0])) {
                if (p.matcher(s).matches())
                    list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        for (String s:
                readByWords(args)) {
            System.out.println(s);
        }
    }
}
