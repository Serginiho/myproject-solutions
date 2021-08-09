package com.homecompany.chapter8.exercise6;

class Caution extends Alert {
    @Override
    void signalAlert() {
        super.signalAlert();
        System.out.println("Осторожно");
    }
}
