package com.homecompany.chapter16.exercise23;

import java.util.Arrays;
import java.util.Comparator;

class TestIntegerArray {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}
