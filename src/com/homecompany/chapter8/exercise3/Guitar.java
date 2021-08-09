package com.homecompany.chapter8.exercise3;

class Guitar extends Stringer{
    Guitar(){System.out.println("Конструктор Guitar()");}
 /*   @Override
    void play(Note n) {
        adjust();
        System.out.print("Guitar.play() " + n + ", ");
    }*/

    @Override
    public String toString() {
        return super.toString() + " - Guitar";
    }
}
