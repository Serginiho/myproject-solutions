package com.homecompany.chapter14.exercise22_23;

import com.homecompany.chapter14.exercise21.InterfaceP;
import com.homecompany.chapter14.exercise21.RealObject;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static void main (String[] args){
        RealObject real = new RealObject();
        InterfaceP proxy = (InterfaceP) Proxy.newProxyInstance(real.getClass().getClassLoader(),real.getClass().getInterfaces(),
                new DynamicProxyHandler(real));
        proxy.somethingElse("badu");
        proxy.doSomething();
    }
}
