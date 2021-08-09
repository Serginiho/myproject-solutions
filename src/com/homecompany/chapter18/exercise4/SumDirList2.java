package com.homecompany.chapter18.exercise4;

import util.Directory;

import java.io.File;

public class SumDirList2 {
    public static void main(String[] args) {
        int size = 0;
        for (File f:
                Directory.walk("/Users/serginiho/IdeaProjects/myproject/src/", ".*\\.j.*")) {
            size +=f.length();
            System.out.println(f);
        }
        System.out.println(size/1024);
    }
}
