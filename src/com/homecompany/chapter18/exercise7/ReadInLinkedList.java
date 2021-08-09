package com.homecompany.chapter18.exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReadInLinkedList {
    public static List<String> read (String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        List<String> list = new LinkedList<>();
        String s;
        while ((s = in.readLine()) != null)
            list.add(s);
        in.close();
        return list;
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new LinkedList<>(read("FileFinder.java"));
        ListIterator<String> it = list.listIterator(list.size());
        String s;
        while (it.hasPrevious()) {
            s = it.previous();
           System.out.println(s);
        }
    }
}