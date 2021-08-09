package com.homecompany.chapter8.exercise3;

import com.homecompany.chapter9.exercise4.Playable;

class Percussion extends Instrument implements Playable {
    Percussion(){
        new Flute().addRef();
        System.out.println("Конструктор Percussion()");}

    @Override
    public void play(Note n) {
        adjust();
        System.out.print("Percussion.play() " + n + ", ");
    }

    @Override
    public void adjust() {
        System.out.print("Percussion.adjust(), ");
    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Percussion";
    }
}
