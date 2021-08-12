package com.homecompany.chapter21.exercise9;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryWithPriorities implements ThreadFactory {
    private final int priority;
    public ThreadFactoryWithPriorities (int priority) {
        if(priority!=10 && priority!=1 && priority!=5) {
            System.out.println("Priority must be Thread.MAX_PRIORITY or Thread.MIN_PRIORITY or Thread.NORM_PRIORITY");
            System.exit(0);
        }
        this.priority = priority;
    }
    @Override
    public Thread newThread(@NotNull Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(priority);
        return t;
    }
}
