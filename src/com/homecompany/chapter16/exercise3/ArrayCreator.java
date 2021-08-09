package com.homecompany.chapter16.exercise3;

import java.util.Arrays;
import java.util.Random;

public class ArrayCreator {
    public static Double [][] makeDoubleArray (int size1, int size2, int start, int end){
        if ((size1 < 1) || (size2 < 1)){
            System.out.println("Size must be > 1");
            return null;
        }
        Double [][] doubles = new Double[size1][size2];
//        if ((end - start)<0)
//            System.out.println("End must be greater then start");
        Random rand = new Random((end - start));
//        Double[] intArray = new Double[(end - start)];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = rand.nextDouble();
//        }

        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j] = rand.nextDouble() + (end - start);
            }
        }
        return doubles;
    }
    public static <T> void printArray (T[][] t){
        System.out.println(Arrays.deepToString(t));
    }

    public static void main(String[] args) {
        printArray(makeDoubleArray(1,5,4,2));
    }
}
