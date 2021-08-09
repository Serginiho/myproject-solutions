package com.homecompany.chapter16.exercise15;

import com.homecompany.chapter16.exercise1.BerylliumSphere;
import util.Generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        Generated.array(spheres, new BerylliumSphereGenerator());
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        List<BerylliumSphere> sphereList =
                new ArrayList<>(Arrays.asList
                        (Generated.array(BerylliumSphere.class, new BerylliumSphereGenerator(),5)));
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));
    }
}
