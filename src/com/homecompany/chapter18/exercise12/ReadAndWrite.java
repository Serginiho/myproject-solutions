package com.homecompany.chapter18.exercise12;

import com.homecompany.chapter18.exercise8.ReadInLListFromCL;
import com.homecompany.chapter18.justexamples.BufferedInputFile;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ReadAndWrite {
    static String file = "WriteFileFromLinkedList.txt";

    public static void main(String[] args) throws IOException {
        List<String> list = ReadInLListFromCL.readWithCL(args);
        PrintWriter out = new PrintWriter(file);
        int countLine = 1;
        for (String s:
             list) {
            out.println(countLine++ + " " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read("WriteFileFromLinkedList.txt"));
    }
}
