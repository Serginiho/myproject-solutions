package com.homecompany.chapter21.exercise8;

public class MoreBasicThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new LiftOff());
            threads[i].setDaemon(true);
            threads[i].start();
        }
        System.out.println("Wait for Lift off");
    }
}
