package com.homecompany.chapter12.exercise15;

import com.homecompany.chapter12.exercise14.OnOffException1;
import com.homecompany.chapter12.exercise14.OnOffException2;
import com.homecompany.chapter12.exercise14.OnOffSwitch;
import com.homecompany.chapter12.exercise14.Switch;

public class WithFinally {
    private static Switch sw = new Switch();
    public static void main (String[] args){
        try {
            sw.on();
            OnOffSwitch.f();
            throw new RuntimeException();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
        }finally {
            sw.off();
    }
    }
}
