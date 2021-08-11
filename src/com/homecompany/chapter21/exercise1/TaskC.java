package com.homecompany.chapter21.exercise1;

public class TaskC implements Runnable{
    public TaskC() {
        System.out.println("Start TaskC");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("TaskC " + i);
            Thread.yield();
        }
        System.out.println("End TaskC");
    }
}
