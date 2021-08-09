package com.homecompany.chapter12.exercise22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FailingConstructor {
    private BufferedReader in;
    FailingConstructor (String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            throw new UnsupportedOperationException("Преднамеренная ошибка");
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw e;
        }catch (Exception e) {
            try {
                in.close();
        } catch (IOException ioException) {
                System.out.println("Fail close file");
            }
            throw e;
        }
    }
    String getLine () {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Fail read file");
        }
        return s;
    }
    void dispose () {
        try {
            in.close();
            System.out.println("File closed");
        } catch (IOException e) {
            throw new RuntimeException("Fail close file");
        }
    }
}

