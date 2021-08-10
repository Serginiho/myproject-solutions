package com.homecompany.chapter21.exercise2;

public class FibonacciTaskInThreads {
    public static void main(String[] args) {
            new Thread(new FibonacciTask1(10)).start();
            new Thread(new FibonacciTask2(15)).start();
            new Thread(new FibonacciTask3(20)).start();

    }
}
