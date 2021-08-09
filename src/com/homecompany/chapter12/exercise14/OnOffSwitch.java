package com.homecompany.chapter12.exercise14;

public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1, OnOffException2 {
    }
    public static void main (String[] args){
        try {
            sw.on();
            f();
            throw new RuntimeException();
//            sw.off();
        } catch (OnOffException2 e2) {
            e2.printStackTrace();
            sw.off();
        } catch (OnOffException1 e1) {
            e1.printStackTrace();
            sw.off();
        }
    }
}
