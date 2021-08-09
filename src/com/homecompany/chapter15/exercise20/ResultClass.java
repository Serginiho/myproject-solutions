package com.homecompany.chapter15.exercise20;

class ResultClass implements InterFace{

    @Override
    public void methodA() {
        System.out.println("methodA() in ResultClass");
    }

    @Override
    public void methodB() {
        System.out.println("methodB() in ResultClass");
    }
    public void methodC() {
        System.out.println("self methodC() in ResultClass");
    }
}
