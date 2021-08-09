package com.homecompany.chapter15.exercise36;

class Failure2 extends NoSuchMethodException{
    String msg;
    Failure2 (String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg + Failure2.class.getSimpleName() + " " + Failure2.class.getSuperclass();
    }
}
