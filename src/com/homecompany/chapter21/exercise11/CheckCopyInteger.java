package com.homecompany.chapter21.exercise11;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CheckCopyInteger implements Runnable{
    private CopyInteger ci;
    private Random random = new Random();
    CheckCopyInteger(CopyInteger copyInteger) {
        ci = copyInteger;
    }

    @Override
    public void run() {
        for ( ; ; ){
            if(random.nextBoolean()) {
                ci.intIncrementA();
            } else {
                ci.intIncrementB();
            }
            ci.checkValid();
        }
    }
    static void test (CopyInteger cp, int count) {
        System.out.println("Start test");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            service.execute(new CheckCopyInteger(cp));
        }
        Thread.yield();
        service.shutdown();

        System.out.println("End test");
    }
}
