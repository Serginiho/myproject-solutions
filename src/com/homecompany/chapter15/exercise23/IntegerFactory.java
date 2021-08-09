package com.homecompany.chapter15.exercise23;

class IntegerFactory implements FactoryI<Integer>{
    @Override
    public Integer create(int arg) {
        return arg;
    }
}
