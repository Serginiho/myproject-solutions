package com.homecompany.chapter21.exercise1;

public class RunTaskInThreads {
    public static void main(String[] args) {
        new Thread(new TaskA()).start();
        new Thread(new TaskB()).start();
        new Thread(new TaskC()).start();
    }
}
