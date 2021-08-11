package com.homecompany.chapter21.exercise6;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomSleepTask implements Runnable{
    private static int taskCount = 0;
    private final int id = taskCount++;
    private static Random random = new Random();
    @Override
    public void run() {
        int timeToSleep = random.nextInt(9) + 1;
        try {
            TimeUnit.SECONDS.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("RandomSleepTask " + id + " was sleep for " + timeToSleep + " sec");
        }
    }
}
