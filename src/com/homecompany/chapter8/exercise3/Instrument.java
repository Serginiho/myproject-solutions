package com.homecompany.chapter8.exercise3;

class Instrument {
    Instrument(){System.out.println("Конструктор Instrument()");}
 /*   void play (Note n){
        adjust();
        System.out.println("Instrument.play()" + n);
    }
    void adjust (){
        System.out.println("Instrument.adjust()");
    }*/
    @Override
    public String toString() {
        return "Instrument: ";
    }
}
