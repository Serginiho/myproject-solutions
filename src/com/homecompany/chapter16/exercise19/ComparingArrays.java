package com.homecompany.chapter16.exercise19;

import java.util.Arrays;

class ComparingArrays {
    public static void main(String[] args) {
        Object[] o1 = new Object[10];
        Arrays.fill(o1, new ClassForComparison(2));
        Object[] o2 = new Object[10];
        Arrays.fill(o2, new ClassForComparison(2));
        System.out.println(Arrays.toString(o1));
        System.out.println(Arrays.toString(o2));
        System.out.println(Arrays.equals(o1, o2));
        System.arraycopy(o1,0, o2, 0, o2.length);
        System.out.println(Arrays.equals(o1, o2));
    }
}
