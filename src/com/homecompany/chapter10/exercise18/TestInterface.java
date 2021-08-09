package com.homecompany.chapter10.exercise18;
//упражение 19
public class TestInterface implements MyInterface{

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean p() {
        return true;
    }
    public static void main(String[] args){
        TestInterface ti = new TestInterface();
        InClass.h(ti);

    }
}
