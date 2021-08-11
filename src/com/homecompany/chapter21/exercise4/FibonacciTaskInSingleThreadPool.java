package com.homecompany.chapter21.exercise4;

import com.homecompany.chapter21.exercise2.FibonacciTask1;
import com.homecompany.chapter21.exercise2.FibonacciTask2;
import com.homecompany.chapter21.exercise2.FibonacciTask3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibonacciTaskInSingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new FibonacciTask1(10));
        executorService.execute(new FibonacciTask2(15));
        executorService.execute(new FibonacciTask3(20));
        executorService.shutdown();
    }
}
