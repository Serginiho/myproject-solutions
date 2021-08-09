package com.homecompany.chapter7.extend;

class OverridingPrivate extends WithFinals {
    @Override
    protected void f(){
        System.out.println("OverridingPrivate.f()");
        super.f();
    }
    @Override
    protected void g(){
        System.out.println("OverridingPrivate.g()");
        super.g();
    }
}
