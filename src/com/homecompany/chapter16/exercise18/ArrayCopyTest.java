package com.homecompany.chapter16.exercise18;

import com.homecompany.chapter16.exercise1.BerylliumSphere;
import com.homecompany.chapter16.exercise15.BerylliumSphereGenerator;
import util.Generated;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        BerylliumSphere[] s1 = new BerylliumSphere[10];
        s1 = Generated.array(BerylliumSphere.class, new BerylliumSphereGenerator(), 10);
        System.out.println("Before copy: ");
        System.out.println("s1: " + Arrays.toString(s1));
        BerylliumSphere[] s2 = new BerylliumSphere[9];
        System.out.println("s2: " + Arrays.toString(s2));
        System.arraycopy(s1,0, s2,0, s2.length);
        System.out.println("After copy: ");
        System.out.println("s2: " + Arrays.toString(s2));
        System.out.print("s1: ");
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + " ");
        }
        System.out.println();
        System.out.print("s2: ");
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i] + " ");
        }
    }
}
