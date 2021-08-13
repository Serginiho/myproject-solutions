package com.homecompany.chapter21.exercise10;

import com.homecompany.chapter21.exercise5.FibonacciSumTask;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMethodWithFibonacciSumTask {
    private ExecutorService executors;
    public Future<BigInteger> runTask (int quantityOfFib) {
        Future<BigInteger> future = null;
        if (executors == null) {
            executors = Executors.newCachedThreadPool();
            future = executors.submit(new FibonacciSumTask(quantityOfFib));
 //           System.out.print(executors.toString() + " ");
            executors.shutdown();
        }
        return future;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            Future<BigInteger> result = new ThreadMethodWithFibonacciSumTask().runTask(i);
                try {
                    System.out.println("Sum of fib quantity " + i + " : "
                            + result.get());
                } catch (ExecutionException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
