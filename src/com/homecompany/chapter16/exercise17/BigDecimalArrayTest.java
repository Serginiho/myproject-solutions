package com.homecompany.chapter16.exercise17;

import util.CountingAndSkipGenerator;
import util.Generated;

import java.math.BigDecimal;
import java.util.Arrays;

class BigDecimalArrayTest {
    public static void main(String[] args) {
        BigDecimal[] a = Generated.array(BigDecimal.class, new CountingAndSkipGenerator.BigDecimal(), 20);
        System.out.println(Arrays.toString(a));
        BigDecimal[] a2 = Generated.array(BigDecimal.class, new CountingAndSkipGenerator.BigDecimal(6), 20);
        System.out.println(Arrays.toString(a2));
    }
}
