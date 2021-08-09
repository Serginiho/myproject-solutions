package com.homecompany.chapter4;

import java.util.Arrays;

public class Fibonacci {
    public static String getFibonacci(int z) {
        if (z >= 2 && z < 47){
        int[] arFib = new int[z];
        arFib[0] = 1;
        arFib[1] = 1;
        for (int i = 2; i < z; i++)
            arFib[i] = arFib[i - 1] + arFib[i - 2];
         return Arrays.toString(arFib);
        } else return "Значение z должно быть больше или равно 2, но меньше 47";
    }
        public static void main (String[] args){
            System.out.print(getFibonacci(29));
        }
}
