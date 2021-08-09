package com.homecompany.chapter8.exercise6;

class Alarm extends Alert{
    @Override
    void signalAlert() {
        super.signalAlert();
        System.out.println("Тревога");
    }
}
