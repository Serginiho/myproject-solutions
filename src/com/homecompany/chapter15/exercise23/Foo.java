package com.homecompany.chapter15.exercise23;

class Foo<T> {
    private T x;
    public <F extends FactoryI<T>> Foo (F factory, int arg){
        x = factory.create(arg);
    }

    @Override
    public String toString() {
        return "Foo{" +
                "x=" + x +
                '}';
    }
}
