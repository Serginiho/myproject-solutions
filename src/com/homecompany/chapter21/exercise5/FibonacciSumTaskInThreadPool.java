package com.homecompany.chapter21.exercise5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.*;

public class FibonacciSumTaskInThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<BigInteger>> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(executorService.submit(new FibonacciSumTask(i)));
        }
        result.parallelStream().filter(Future::isDone).forEach(sum -> {
            try {
                System.out.println(sum.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }
        });
    }
}
