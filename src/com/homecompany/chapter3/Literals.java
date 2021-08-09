package com.homecompany.chapter3;

public class Literals {
    public static void main (String[] args) {
        long i5 = 0x1a2d5c7fL;
        System.out.println("i5 is " + Long.toBinaryString(i5));
        long i6 = 879L;
        System.out.println("i6 is " + Long.toBinaryString(i6));
        int i1 = 277;
        int i2 = 432;
        int i3 = ~i1;
        int i4 = -433;
        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println("i2: " + Integer.toBinaryString(i2));
        System.out.println("i1 & i2: " + Integer.toBinaryString(i1 & i2));
        System.out.println("i1 | i2: " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^= i2: " + Integer.toBinaryString(i1 ^= i2));
        System.out.println("~i1: " + (~i1));
        System.out.println("~i2: " + (~i2));
        System.out.println(i1^i2);
        System.out.println("i3: " + Integer.toBinaryString(i3));
        System.out.println("i4: " + Integer.toBinaryString(i4));
        System.out.println(Integer.toBinaryString(i3^i4));
        System.out.println(Integer.toBinaryString(277^432));
        int i = 0x9f;
        System.out.println (Integer.toBinaryString(i));
        System.out.println (Integer.toBinaryString(i >>= 1));
        System.out.println (Integer.toBinaryString(i >>= 1));
        System.out.println (Integer.toBinaryString(i>>= 1));
        System.out.println (Integer.toBinaryString(i>>= 1));
        System.out.println (Integer.toBinaryString(i>>= 1));
        System.out.println (Integer.toBinaryString(i>>= 1));
        System.out.println (Integer.toBinaryString(i>>= 1));
        System.out.println (Integer.toBinaryString(i>>= 1));
        int i8 = 0x1f;
        System.out.println(Integer.toBinaryString(i8));
        System.out.println(Integer.toBinaryString(i8 <<= 10));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        System.out.println(Integer.toBinaryString(i8 >>>= 1));
        char c = 0xabcf;
        System.out.println(Integer.toBinaryString(c));
    }
}
