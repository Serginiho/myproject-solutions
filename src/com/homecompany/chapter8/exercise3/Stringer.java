package com.homecompany.chapter8.exercise3;

import com.homecompany.chapter9.exercise4.Playable;

class Stringer extends Instrument implements Playable {
    Stringer(){
        new Flute().addRef();
        System.out.println("Конструктор Stringer()");}
    @Override
    public void play(Note n) {
        adjust();
        System.out.print("Stringer.play() " + n + ", ");
    }

    @Override
    public void adjust() {
        System.out.print("Stringer.adjust(), ");
    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Stringer";
    }
}
