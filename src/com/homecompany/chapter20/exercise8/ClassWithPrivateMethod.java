package com.homecompany.chapter20.exercise8;

import util.atunit.TestProperty;

public class ClassWithPrivateMethod {
    public ClassWithPrivateMethod () {}
    private int privateMethod () {
        return 1+3*(3+3);
    }
    @TestProperty
    public int accessMethod () {
        return this.privateMethod();
    }
}
