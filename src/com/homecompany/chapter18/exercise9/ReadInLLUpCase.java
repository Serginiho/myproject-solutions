package com.homecompany.chapter18.exercise9;

import com.homecompany.chapter18.exercise8.ReadInLListFromCL;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadInLLUpCase {
    public static List<String> readInLLUpCase (String[] args) throws IOException {
        List<String> list = new LinkedList<>();
        for (String s : ReadInLListFromCL.readWithCL(args)) {
            list.add(s.toUpperCase());
        }
        return list;
    }
    public static void main(String[] args) throws IOException {
        for (String s:
                readInLLUpCase(args)) {
            System.out.println(s);
        }
    }
}
