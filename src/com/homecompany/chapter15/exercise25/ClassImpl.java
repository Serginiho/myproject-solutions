package com.homecompany.chapter15.exercise25;

class ClassImpl implements InterFirst, InterSecond{

    @Override
    public void methodInterFirst() {
        System.out.println("methodInterFirst() in ClassImpl");
    }

    @Override
    public void methodInterSecond() {
        System.out.println("methodInterSecond() in ClassImpl");
    }
}
