package com.homecompany.chapter16.exercise12;

import util.CountingAndSkipGenerator;
import util.Generator;

import java.util.Arrays;

class DoublesArray {
    public static void main(String[] args) {
        double[] doubles = new double[10];
        Generator<Double> g = new CountingAndSkipGenerator.Double();
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = g.next();
        }
        System.out.println(Arrays.toString(doubles));
    }
}
