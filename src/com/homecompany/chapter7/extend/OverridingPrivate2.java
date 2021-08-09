package com.homecompany.chapter7.extend;

final class OverridingPrivate2 extends OverridingPrivate {
    @Override
    public void f(){
        System.out.println("OverridingPrivate2.f()");
        super.f();
    }
    @Override
    public void g(){
        System.out.println("OverridingPrivate2.g()");
        super.g();
    }
    public static void main (String[] args){
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

    }
}
