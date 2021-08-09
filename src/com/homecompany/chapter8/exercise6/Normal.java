package com.homecompany.chapter8.exercise6;

class Normal extends Alert{
    @Override
    void signalAlert() {
        super.signalAlert();
        System.out.println("Нормальное состояние");
    }
}
