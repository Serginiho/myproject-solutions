package com.homecompany.chapter15.exercise3;

public class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {
    public final F sixth;
    public SixTuple (A a, B b, C c, D d, E e, F f){
        super(a, b, c, d, e);
        sixth = f;
    }

    @Override
    public String toString() {
        return sixth +
                ", " + fifth +
                ", " + fourth +
                ", " + third +
                ", " + second +
                ", " + first;
    }
}
