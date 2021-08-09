package com.homecompany.chapter7.extend;

public class OverridingPrivate3 {
    public static void main (String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        OverridingPrivate op = new OverridingPrivate();
        op.f();
    }
}
