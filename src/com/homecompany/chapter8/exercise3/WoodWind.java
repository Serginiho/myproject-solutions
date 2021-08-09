package com.homecompany.chapter8.exercise3;

class WoodWind extends Wind{
    WoodWind(){System.out.println("Конструктор WoodWind()");}
 /*   @Override
    void play(Note n) {
        adjust();
        System.out.print("WoodWind.play() " + n + ", ");
    }*/
    @Override
    public String toString() {
        return super.toString() + " - WoodWind";
    }
}
