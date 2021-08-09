package com.homecompany.chapter16.exercise16;

import util.ConvertTo;
import util.CountingAndSkipGenerator;
import util.Generated;

import java.util.Arrays;

class TestArrayGeneration {
    public static void main(String[] args) {
        int[] a = ConvertTo.primitive(Generated.array(Integer.class, new CountingAndSkipGenerator.Integer(5), 10));
        System.out.println(Arrays.toString(a));
        double [] a2 = ConvertTo.primitive(Generated.array(Double.class, new CountingAndSkipGenerator.Double(2.5), 10));
        System.out.println(Arrays.toString(a2));
        String[] s = Generated.array(String.class, new CountingAndSkipGenerator.String(5), 10);
        System.out.println(Arrays.toString(s));
        char[] c = ConvertTo.primitive(Generated.array(Character.class, new CountingAndSkipGenerator.Character(1), 10));
        System.out.println(c);
        byte[] b = ConvertTo.primitive(Generated.array(Byte.class, new CountingAndSkipGenerator.Byte((byte)20), 10));
        System.out.println(Arrays.toString(b));
        short[] shorts = ConvertTo.primitive(Generated.array(Short.class, new CountingAndSkipGenerator.Short((short) 30), 10));
        System.out.println(Arrays.toString(shorts));
        long[] l = ConvertTo.primitive(Generated.array(Long.class, new CountingAndSkipGenerator.Long(10L), 10));
        System.out.println(Arrays.toString(l));
        float[] f = ConvertTo.primitive(Generated.array(Float.class, new CountingAndSkipGenerator.Float((float) 2.9), 10));
        System.out.println(Arrays.toString(f));
    }
}
