package com.homecompany.chapter21.exercise9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable{
    private int countDown = 5;
    private volatile double d;
    public SimplePriorities() {
    }
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }
    @Override
    public void run() {
        while(true) {
            for(int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.
                newCachedThreadPool(new ThreadFactoryWithPriorities(Thread.MAX_PRIORITY));
        ExecutorService executorService2 = Executors.
                newCachedThreadPool(new ThreadFactoryWithPriorities(Thread.MIN_PRIORITY));
        for (int i = 0; i < 5; i++) {
            executorService1.execute(new SimplePriorities());
            executorService2.execute(new SimplePriorities());
        }
        executorService1.shutdown();
        executorService2.shutdown();
    }
}
