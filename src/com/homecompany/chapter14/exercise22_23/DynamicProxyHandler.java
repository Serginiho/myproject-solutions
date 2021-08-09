package com.homecompany.chapter14.exercise22_23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler (Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("***** proxy: " + proxy.getClass() + ", method: " + method.getName() + ", args: " + Arrays.toString(args));
 //       System.out.println("proxy: " + proxy); // Exception in thread "main" java.lang.StackOverflowError
        Instant start = Instant.now();
        Object result = method.invoke(proxied, args);
        Instant stop = Instant.now();
        long time = Duration.between(start, stop).toNanos();
        System.out.println("Method: " + method.getName() + " done in " + time + " ns");
        return result;
    }
}
