package com.homecompany.chapter16.exercise4;

import java.util.Arrays;
import java.util.Random;

public class ThreeDimArrayCreator {
    public static Double[][][] make3DArray (int size1, int size2, int size3, int start, int end){
        if (size1 < 1 || size2 < 1 || size3 < 1){
            System.out.println("Size must be > 1");
        return new Double[1][1][1];
        }
        Double[][][] threeDimArray = new Double[size1][size2][size3];
        Random random = new Random(end-start);
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    threeDimArray[i][j][k] = random.nextDouble()+(end-start);
                }
            }
        }
        return threeDimArray;
    }
    public static <T> void printThreeDimArray (T[][][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                for (int k = 0; k < t[i][j].length; k++) {
                    System.out.print("arg [" + i + "], [" + j+ "], [" + k + "] " + t[i][j][k] +"\n");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printThreeDimArray(make3DArray(1,3,3,3,5));
        System.out.println();
        System.out.println(Arrays.deepToString(make3DArray(3, 3, 3, 3, 5)));
    }
}
