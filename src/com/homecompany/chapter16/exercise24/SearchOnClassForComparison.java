package com.homecompany.chapter16.exercise24;

import com.homecompany.chapter16.exercise19.ClassForComparison;

import java.util.Arrays;

class SearchOnClassForComparison {
    public static void main(String[] args) {
        ClassForComparison[] cfc = {new ClassForComparison(5), new ClassForComparison(2),
        new ClassForComparison(4), new ClassForComparison(1), new ClassForComparison(8),
        new ClassForComparison(10), new ClassForComparison(3), new ClassForComparison(6),
                new ClassForComparison(7)};
        System.out.println(Arrays.toString(cfc));
        ClassForComparison c = new ClassForComparison(10);
        Arrays.sort(cfc);
        System.out.println(Arrays.toString(cfc));
        int index = Arrays.binarySearch(cfc, new ClassForComparison(5));
        if(index>=0)
        System.out.println("index " + index + " cfc[index] " + cfc[index]);
    }
}
