package com.homecompany.chapter15.exercise30;

import com.homecompany.generics.Holder;

class PrimitiveHolder {
    static <T> void testPrimitive(T arg){
        System.out.println(arg.getClass().getSimpleName());
        Holder<T> tHolder = new Holder<>();
        tHolder.set(arg);
        T arg2 = tHolder.get();
        System.out.println(arg2);
        System.out.println(arg2.getClass().getSimpleName());
        System.out.println();
    }
    public static void main(String[] args) {
        byte b = 2;
        short s = 3;
        int i = 4;
        long l = 5L;
        double d = 6.1;
        float f = 7.1F;
        char c = 'c';
        testPrimitive(b);
        testPrimitive(s);
        testPrimitive(i);
        testPrimitive(l);
        testPrimitive(d);
        testPrimitive(f);
        testPrimitive(c);
    }
}
