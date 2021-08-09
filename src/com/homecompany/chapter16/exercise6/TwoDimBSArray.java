package com.homecompany.chapter16.exercise6;

import com.homecompany.chapter16.exercise1.BerylliumSphere;

import java.util.Arrays;

class TwoDimBSArray {
    public static Object[][] makeTwoBSArray (int sizeA1, int sizeA2){
        if (sizeA1 < 1 || sizeA2 < 1)
            return new Object[0][0];
        Object[][] arrayBS = new Object[sizeA1][sizeA2];
        for (int i = 0; i < arrayBS.length; i++) {
            for (int j = 0; j < arrayBS[i].length; j++) {
                arrayBS[i][j] = new BerylliumSphere();
            }
        }
        return arrayBS;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(makeTwoBSArray(8, 8)));
    }
}
