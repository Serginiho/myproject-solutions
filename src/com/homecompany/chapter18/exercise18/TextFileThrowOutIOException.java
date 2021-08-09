package com.homecompany.chapter18.exercise18;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFileThrowOutIOException extends ArrayList<String> {
    public static String read(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(
                new File(fileName).getAbsolutePath()))) {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public static void write(String fileName, String text) throws FileNotFoundException {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
    }
    public TextFileThrowOutIOException(String fileName, String splitter) throws IOException {
        super(Arrays.asList(read(fileName).split(splitter)));
        if(get(0).equals("")) remove(0);
    }
    public TextFileThrowOutIOException(String fileName) throws IOException {
        this(fileName, "\n");
    }
    public void write(String fileName) throws FileNotFoundException {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                for(String item : this)
                    out.println(item);
            } finally {
                out.close();
            }
    }
}
