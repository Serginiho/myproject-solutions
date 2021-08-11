package com.homecompany.chapter21.exercise6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RandomSleepTaskInThread {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Enter in program argument quantity of RandomSleepTask");
            System.exit(0);
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        int quantityTask = Integer.parseInt(args[0]);
        for (int i = 0; i < quantityTask; i++) {
            executorService.execute(new RandomSleepTask());
        }
        executorService.shutdown();
    }
}
