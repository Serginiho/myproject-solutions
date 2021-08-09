package com.homecompany.chapter14.exercise21;

public class SimpleProxyDemo {
    public static void consumer (InterfaceP iface){
        iface.doSomething();
        iface.somethingElse("badu");
    }
    public static void main (String[] args){
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
