package com.homecompany.chapter18.exercise3;

import java.io.File;

public class SumDirList {
    public static void main(String[] args) {
        File path = new File("/Users/serginiho/Documents/MyDoc/GreenTown");
        String[] list;
        list = path.list();
        double size = 0.0;
        for (String s:
             list) {
            size += new File("/Users/serginiho/Documents/MyDoc/GreenTown/" + s).length();
            System.out.println(s);
        }
        System.out.println("Total size: " + size/1024 + " kb");
    }
}
