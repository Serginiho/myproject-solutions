package com.homecompany.chapter15.exercise25;

class ClassGener<T extends InterFirst & InterSecond> {
    private T x;
    ClassGener (T x){
        this.x = x;
    }
    T getX () { return x;}
    <F extends InterFirst> void getFirstM (F x){
        x.methodInterFirst();
    }
    <C extends InterSecond> void getSecondM (C x) {
        x.methodInterSecond();
    }

    public static void main(String[] args) {
        ClassGener<ClassImpl> cg = new ClassGener<>(new ClassImpl());
        cg.getFirstM(cg.getX());
        cg.getSecondM(cg.getX());
    }
}
