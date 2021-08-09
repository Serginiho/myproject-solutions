package com.homecompany.chapter16.exercise5;

import java.util.Arrays;

class MultiDimArrayInit {


    public static void main(String[] args) {
        Object[][][] objects = new Object[3][2][3];
        Class<?>[][] classes = new Class[2][2];
        System.out.println(Arrays.deepToString(objects));
        System.out.println(Arrays.deepToString(classes));
    }
}
