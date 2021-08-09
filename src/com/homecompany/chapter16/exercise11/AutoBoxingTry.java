package com.homecompany.chapter16.exercise11;

public class AutoBoxingTry {
    public static void main(String[] args) {
        int[] a = new int[2];
        Integer[] b = {1,2,3};
 //       a = b; // не допустимо
        a[0] = b[0];
        System.out.println(a[0] + " " + a.getClass().getSimpleName() + " " + a.getClass().isPrimitive());
        char[] c = new char[2];
        Character[] ch = {'a','b','c'};
 //       c = ch; // не допустимо
        c[0] = ch[0];
        System.out.println(c[0]);
    }
}
