package com.homecompany.chapter16.exercise7;

import com.homecompany.chapter16.exercise1.BerylliumSphere;
import com.homecompany.chapter16.exercise4.ThreeDimArrayCreator;

class ThreeDimBSArray {
    public static Object[][][] makeThreeDimBSArray (int sizeA1, int sizeA2, int sizeA3){
        if (sizeA1<1 || sizeA2<1 || sizeA3<1)
            return new Object[0][0][0];
        Object[][][] threeDimBS = new Object[sizeA1][sizeA2][sizeA3];
        for (int i = 0; i < sizeA1; i++) {
            for (int j = 0; j < sizeA2; j++) {
                for (int k = 0; k < sizeA3; k++) {
                    threeDimBS[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return threeDimBS;
    }

    public static void main(String[] args) {
        ThreeDimArrayCreator.printThreeDimArray(makeThreeDimBSArray(1,1,1));
    }
}
