package com.homecompany.chapter16.exercise21;

import com.homecompany.chapter16.exercise1.BerylliumSphere;
import com.homecompany.chapter16.exercise15.BerylliumSphereGenerator;
import util.Generated;

import java.util.Arrays;

class TestSortArrays {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = Generated.array(new BerylliumSphere[9], new BerylliumSphereGenerator());
        System.out.println(Arrays.toString(spheres));
        Arrays.sort(spheres);
        System.out.println(Arrays.toString(spheres));
        Arrays.sort(spheres, new BerylliumSphereComparator());
        System.out.println(Arrays.toString(spheres));
    }
}
