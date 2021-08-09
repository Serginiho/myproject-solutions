package com.homecompany.chapter12.exercise26;

import java.io.FileInputStream;

class MainException {
    public static void main (String[] args) throws Exception{
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
    }
}
