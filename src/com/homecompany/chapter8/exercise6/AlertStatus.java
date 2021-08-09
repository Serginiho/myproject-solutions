package com.homecompany.chapter8.exercise6;

import java.util.Random;

class AlertStatus {
    private Alert[] a = {new Alarm(),new Normal(),new Caution()};
    private Random rnd = new Random();
    Alert checkStatus(){
        int i = rnd.nextInt(3);
        return a[i];
    }
    void showStatus(){
        checkStatus().signalAlert();}
}
