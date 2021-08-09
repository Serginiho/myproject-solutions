package com.homecompany.chapter4;

import java.util.Arrays;

public class Vampire {
    public static void main (String[] args){
        char[] candidatChar, checkChar;
        String candidatStr, checkStr;
        int k;
        for (int i=10; i<100; i++) {
            for (int i1 = i; i1 < 100; i1++) {
                k = i * i1;
                candidatStr = Integer.toString(k);
                checkStr = Integer.toString(i) + i1;

                candidatChar = candidatStr.toCharArray();
                checkChar = checkStr.toCharArray();
                Arrays.sort(candidatChar);
                Arrays.sort(checkChar);

                if (Arrays.equals(candidatChar,checkChar)){
                    System.out.println(k + " = " + i + " * " + i1);
                    System.out.println(Arrays.toString(candidatChar));
                    System.out.println(Arrays.toString(checkChar));}
            }
        }
    }
}
