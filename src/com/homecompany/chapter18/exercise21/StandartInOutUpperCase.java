package com.homecompany.chapter18.exercise21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class StandartInOutUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader stdrin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s= stdrin.readLine())!=null && s.length() != 0)
            System.out.println(s.toUpperCase(Locale.ROOT));
    }
}
