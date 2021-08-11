package com.homecompany.chapter21.exercise5;

import java.math.BigInteger;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class FibonacciSumTask implements Callable<BigInteger> {
    private int quantity;
    public FibonacciSumTask (int n) {
        this.quantity = n;
    }

    @Override
    public BigInteger call() throws Exception {
        return Stream.iterate(new BigInteger[]{BigInteger.ZERO,BigInteger.ONE}, fib -> new BigInteger[]{fib[1], fib[0].add(fib[1])})
                .limit(quantity).map(fib -> fib[0]).reduce(BigInteger.ZERO, BigInteger::add);
    }
}
