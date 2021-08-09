package com.homecompany.chapter8.exercise3;

class Brass extends Wind {
    Brass (){System.out.println("Конструктор Brass()");}
    /*   @Override
       void play(Note n) {
           adjust();
           System.out.print("Brass.play() " + n + ", ");
       }*/
    @Override
    public String toString() {
        return super.toString() + " - Brass";
    }
}
