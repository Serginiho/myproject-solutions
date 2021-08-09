package com.homecompany.chapter14.exercise21;

import java.time.Duration;
import java.time.Instant;

public class SimpleProxy implements InterfaceP {
    private InterfaceP proxied;
    public SimpleProxy (InterfaceP proxied){
        this.proxied = proxied;
    }
    @Override
    public void doSomething (){
        Instant start = Instant.now();
        proxied.doSomething();
        Instant stop = Instant.now();
        long time = Duration.between(start,stop).toNanos();
        System.out.println("SimpleProxy did doSomething in " + time + " ns" );
    }
    @Override
    public void somethingElse (String arg) {
        Instant start = Instant.now();
        proxied.somethingElse(arg);
        Instant stop = Instant.now();
        long time = Duration.between(start,stop).toNanos();
        System.out.println("SimpleProxy did somethingElse in " + time + " ns" );
    }
}
