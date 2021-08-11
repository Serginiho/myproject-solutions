package com.homecompany.chapter21.exercise1;

public class TaskA implements Runnable{
    public TaskA () {
        System.out.println("Start TaskA");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("TaskA " + i);
            Thread.yield();
        }
        System.out.println("End TaskA");
    }
}
