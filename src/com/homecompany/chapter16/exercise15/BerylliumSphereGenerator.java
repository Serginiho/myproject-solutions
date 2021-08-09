package com.homecompany.chapter16.exercise15;

import com.homecompany.chapter16.exercise1.BerylliumSphere;
import util.Generator;

public class BerylliumSphereGenerator implements Generator<BerylliumSphere> {

    @Override
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}
