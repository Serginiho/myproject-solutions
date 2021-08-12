package com.homecompany.chapter21.exercise7;

public class DaemonSpawn implements Runnable {

    @Override
    public void run() {
        while (true)
            Thread.yield();
    }
}
