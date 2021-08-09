package com.homecompany.chapter16.exercise2;

import com.homecompany.chapter16.exercise1.BerylliumSphere;

import java.util.Arrays;

class SphereCreator {
    public static Object[] makeSpheres (int size){
        Object[] bs = new Object[size];
        for (int i = 0; i < bs.length; i++) {
            bs[i] = new BerylliumSphere();
        }
        return bs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeSpheres(4)));
        System.out.println(Arrays.toString(makeSpheres(1)));
    }
}
