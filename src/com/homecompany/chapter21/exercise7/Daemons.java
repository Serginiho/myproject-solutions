package com.homecompany.chapter21.exercise7;

import java.util.concurrent.TimeUnit;

public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        if(args.length < 1){
            System.out.println("Input time to sleep");
            System.exit(0);
        }
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.print("d.isDaemon = " + d.isDaemon() + ", ");
        long timeOut = Long.parseLong(args[0]);
        TimeUnit.NANOSECONDS.sleep(timeOut);
    }
}
