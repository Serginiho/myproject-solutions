package com.homecompany.chapter8.exercise3;

import com.homecompany.chapter9.exercise4.Playable;

class Wind extends Instrument implements Playable {

    Wind(){
        new Flute().addRef();
        System.out.println("Конструктор Wind()");
    }

    @Override
    public void play(Note n) {
        adjust();
        System.out.print("Wind.play() " + n + ", ");
    }

    @Override
    public void adjust() {
        System.out.print("Wind.adjust(), ");
    }
    //26 упражнение глава 14:
    public void clearSpitValve (Object obj) {
        System.out.println(obj.getClass().getSimpleName() + " clear spit valve");
    }
    //
    @Override
    public String what() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Wind";
    }
}
