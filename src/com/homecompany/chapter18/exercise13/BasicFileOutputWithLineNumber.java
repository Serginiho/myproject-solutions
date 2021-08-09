package com.homecompany.chapter18.exercise13;

import com.homecompany.chapter18.justexamples.BufferedInputFile;

import java.io.*;

public class BasicFileOutputWithLineNumber {
    static String file = "BasicFileOutputWithLineNumber.out";

    public static void main(String[] args) throws IOException {
        LineNumberReader in = new LineNumberReader(new StringReader
                (BufferedInputFile.read("BasicFileOutputWithLineNumber.java")));
        PrintWriter out = new PrintWriter(new FileWriter("BasicFileOutputWithLineNumber.out"));
        String s;
        while ((s=in.readLine()) !=null)
            out.println(in.getLineNumber() + " " + s);
        out.close();
    }
}