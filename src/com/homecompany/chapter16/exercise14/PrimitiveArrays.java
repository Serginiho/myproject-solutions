package com.homecompany.chapter16.exercise14;

import util.CountingAndSkipGenerator;
import util.Generator;

import java.util.Arrays;

class PrimitiveArrays {
    public static boolean[] fillPrimitive(boolean[] in) {
        Generator<Boolean> g = new CountingAndSkipGenerator.Boolean();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static char[] fillPrimitive(char[] in) {
        Generator<Character> g = new CountingAndSkipGenerator.Character();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static byte[] fillPrimitive(byte[] in) {
        Generator<Byte> g = new CountingAndSkipGenerator.Byte();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static short[] fillPrimitive(short[] in) {
        Generator<Short> g = new CountingAndSkipGenerator.Short();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static int[] fillPrimitive(int[] in) {
        Generator<Integer> g = new CountingAndSkipGenerator.Integer();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static long[] fillPrimitive(long[] in) {
        Generator<Long> g = new CountingAndSkipGenerator.Long();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static float[] fillPrimitive(float[] in) {
        Generator<Float> g = new CountingAndSkipGenerator.Float();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }
    public static double[] fillPrimitive(double[] in) {
        Generator<Double> g = new CountingAndSkipGenerator.Double();
        for(int i = 0; i < in.length; i++)
            in[i] = g.next();
        return in;
    }

    public static void main(String[] args) {
        int[] a1 = new int[10];
        byte[] a2 = new byte[10];
        short[] a3 = new short[10];
        float[] a4 = new float[10];
        double[] a5 = new double[10];
        long[] a6 = new long[10];
        boolean[] a7 = new boolean[10];
        char[] a8 = new char[10];
        System.out.println(a1.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a1)));
        System.out.println(a2.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a2)));
        System.out.println(a3.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a3)));
        System.out.println(a4.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a4)));
        System.out.println(a5.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a5)));
        System.out.println(a6.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a6)));
        System.out.println(a7.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a7)));
        System.out.println(a8.getClass().getSimpleName() + ": " + Arrays.toString(fillPrimitive(a8)));
    }
}
