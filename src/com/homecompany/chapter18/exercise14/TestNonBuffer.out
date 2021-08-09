package com.homecompany.chapter18.exercise14;

import com.homecompany.chapter18.justexamples.BufferedInputFile;

import java.io.*;

public class TestBufferNonBuffer {
    public static void readWriteWithBuffer (String inputFile, String outputFile) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read(inputFile)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        int lineCount = 1;
        String s;
        while ((s=in.readLine()) != null)
            out.println(lineCount++ + " " + s);
        out.close();
    }
    public static void readWriteWithoutBuffer (String inputFile, String outputFile) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream(inputFile));
        PrintStream out = new PrintStream(outputFile);
        while (in.available() != 0)
            out.print((char)in.readByte());
        out.close();
        in.close();
    }

    public static void main(String[] args) throws IOException {
        String fileIn = "TestBufferNonBuffer.java", fileOut = "TestNonBuffer.out", fileOutForBuffer = "TestBuffer.out";
        long start1, duration1, start2, duration2;
        System.out.print("Duration for test with buffer: ");
        start1 = System.nanoTime();
        readWriteWithBuffer(fileIn, fileOutForBuffer);
        duration1 = System.nanoTime() - start1;
        System.out.println(duration1 + " nanosecond");
        System.out.println("-------------");
        System.out.print("Duration for test without buffer: ");
        start2 = System.nanoTime();
        readWriteWithoutBuffer(fileIn, fileOut);
        duration2 = System.nanoTime() - start2;
        System.out.println(duration2 + " nanosecond");
        System.out.println("-------------");
        System.out.println("Difference between method is " + (duration1 - duration2) + " nanosecond");
    }
}
