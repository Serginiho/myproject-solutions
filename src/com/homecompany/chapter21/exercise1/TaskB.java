package com.homecompany.chapter21.exercise1;

public class TaskB implements Runnable{
    public TaskB () {
        System.out.println("Start TaskB");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("TaskB " + i);
            Thread.yield();
        }
        System.out.println("End TaskB");
    }
}
