package com.homecompany.chapter16.exercise21;

import com.homecompany.chapter16.exercise1.BerylliumSphere;

import java.util.Comparator;

public class BerylliumSphereComparator implements Comparator<BerylliumSphere> {

    @Override
    public int compare(BerylliumSphere o1, BerylliumSphere o2) {
        return (Long.compare(o2.value, o1.value));
    }

    @Override
    public Comparator<BerylliumSphere> reversed() {
        return Comparator.super.reversed();
    }
}
