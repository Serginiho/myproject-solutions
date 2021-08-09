package com.homecompany.chapter4;

public class SimpleNumber {
    public static void main (String[] args) {
        int a, b;
        for (a = 2; a <=20; a++) {
            int k = 0;
            for (b = 2; b <= a; b++) {
                if ((a % b) == 0)
                    k++;}
            if (k < 2)
                System.out.println(a);
        }
    }

}
