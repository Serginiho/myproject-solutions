package com.homecompany.chapter16.exercise13;

import util.CountingAndSkipGenerator;
import util.Generator;

class CharToString {
    static String fillString (int size){
        Generator<Character> g = new CountingAndSkipGenerator.Character();
        char[] buf = new char[size];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = g.next();
        }
        return new String(buf);
    }
    public static void main(String[] args) {
        String s = new CountingAndSkipGenerator.Character().next().toString();
        System.out.println(s);
        System.out.println(fillString(10));
        System.out.println(fillString(20));
        System.out.println(fillString(40));
    }
}
