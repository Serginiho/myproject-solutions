package com.homecompany.chapter10.exercise22;

class WithInner2 {
    class Inerr2 extends WithInner.Inner{
        Inerr2(WithInner wi, int i) {
            wi.super(i);
        }
    }
    public static void main (String[] args){
        WithInner wi = new WithInner();
        WithInner2 wi2 = new WithInner2();
        Inerr2 i2 = wi2.new Inerr2(wi, 2);
        System.out.println(i2);
    }
}
