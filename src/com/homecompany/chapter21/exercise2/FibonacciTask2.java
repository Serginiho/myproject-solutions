package com.homecompany.chapter21.exercise2;

import util.Generator;

public class FibonacciTask2 implements Runnable{
    private final int quantity;
    FibonacciTask2(int n) {
        quantity = n;
    }
    Generator<Integer> gen = new Generator<>() {
        private int count = 0;
        @Override
        public Integer next() {
            return fib(count++);
        }
        private int fib(int n) {
            if (n < 2) return 1;
            return fib(n - 2) + fib(n - 1);
        }
    };
    @Override
    public void run() {
        for (int i = 0; i < quantity; i++) {
            System.out.print(gen.next() + " ");
        }
        System.out.println();
    }
}
