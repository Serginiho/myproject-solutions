package com.homecompany.chapter18.exercise20;

import util.BinaryFile;
import util.Directory;

import java.io.File;
import java.io.IOException;
class CafeBabe {
    public static void main(String[] args) throws IOException {
        Directory.TreeInfo outDirectory = Directory.walk(
                "/Users/serginiho/IdeaProjects/myproject/out", ".*.class");
        for (File f:
             outDirectory.files) {
            System.out.println(f.getName() + ":");
            byte[] bytes = BinaryFile.read(f);
            for (int i = 0; i < 4; i++) {
                System.out.printf("%02x", bytes[i]);
            }
            System.out.println();
        }
    }
}
