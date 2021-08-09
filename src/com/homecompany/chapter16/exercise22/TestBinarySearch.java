package com.homecompany.chapter16.exercise22;

import util.ConvertTo;
import util.Generated;
import util.RandomGenerator;

import java.util.Arrays;

class TestBinarySearch {
    public static void main(String[] args) {
        int[] a = ConvertTo.primitive(Generated.array(new Integer[20], new RandomGenerator.Integer(10)));
        System.out.println(Arrays.toString(a));
        int index = Arrays.binarySearch(a, 8);
        if (index >= 0)
            System.out.println(index + " " + a[index]);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        index = Arrays.binarySearch(a, 9);
        if (index >= 0)
            System.out.println(index + " " + a[index]);
        char[] c = {'c', 'd','b','a','z','x'};
        System.out.println(Arrays.toString(c));
        index = Arrays.binarySearch(c,'z');
        if (index >= 0)
            System.out.println(index + " " + c[index]);
    }
}