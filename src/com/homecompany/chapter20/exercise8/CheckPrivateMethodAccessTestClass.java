package com.homecompany.chapter20.exercise8;

import util.atunit.AtUnit;
import util.atunit.Test;

public class CheckPrivateMethodAccessTestClass {
    ClassWithPrivateMethod cwpm = new ClassWithPrivateMethod();
    @Test
    boolean checkPrivateMethod () {
        return cwpm.accessMethod() == 19;
    }

    public static void main(String[] args) {
        try {
            AtUnit.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
