package com.homecompany.chapter18.exercise8;

import com.homecompany.chapter18.exercise7.ReadInLinkedList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadInLListFromCL {
    public static List<String> readWithCL (String[] args) throws IOException {
        if(args.length < 1) {
            System.out.println("input file name in command line");
            return new LinkedList<>();
        }else if (args.length > 2){
            System.out.println("It must be one name of a file");
            return new LinkedList<>();
        }
        return ReadInLinkedList.read(args[0]);
    }
    public static void main(String[] args) throws IOException {
        List<String> list = readWithCL(args);
        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
