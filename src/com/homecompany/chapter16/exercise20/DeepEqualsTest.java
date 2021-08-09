package com.homecompany.chapter16.exercise20;

import com.homecompany.chapter16.exercise19.ClassForComparison;

import java.util.Arrays;

class DeepEqualsTest {
    public static void main(String[] args) {
        Object[][] o1 = new Object[8][8];
        for (int i = 0; i < o1.length; i++) {
            for (int j = 0; j < o1[i].length; j++) {
                o1[i][j] = new ClassForComparison(5);
            }
        }
        System.out.println("o1: " +Arrays.deepToString(o1));
        Object[][] o2 = new Object[8][8];
        for (int i = 0; i < o2.length; i++) {
            for (int j = 0; j < o2[i].length; j++) {
                o2[i][j] = new ClassForComparison(2);
            }
        }
        System.out.println("o2: " +Arrays.deepToString(o2));
        System.out.println("Is o1 equal o2? - " + Arrays.deepEquals(o1, o2));
    }
}
