package com.homecompany.chapter15.exercise36;

class Failure1 extends NullPointerException{
    String msg;
    Failure1 (String msg){
        this.msg = msg;
    }
    @Override
    public String toString() {
        return msg + Failure1.class.getSimpleName() + " " + Failure1.class.getSuperclass();
    }
}
