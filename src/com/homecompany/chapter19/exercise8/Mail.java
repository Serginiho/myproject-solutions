package com.homecompany.chapter19.exercise8;

import util.Enums;

import java.util.Iterator;

public class Mail {
    public enum GeneralDelivery {YES,NO1,NO2,NO3,NO4,NO5}
    public enum Scannability {UNSCANNABLE,YES1,YES2,YES3,YES4}
    public enum Readability {ILLEGIBLE,YES1,YES2,YES3,YES4}
    public enum Forwarding {NO_FORWARD,YES1,YES2,YES3,YES4}
    public enum Address {INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}
    public enum ReturnAddress {MISSING,OK1,OK2,OK3,OK4,OK5}
    public GeneralDelivery generalDelivery;
    public Scannability scannability;
    public Readability readability;
    public Forwarding forwarding;
    public Address address;
    public ReturnAddress returnAddress;
    static long counter = 0;
    long id = counter++;
    public String toString() { return "Mail " + id; }
    public String details() {
        return toString() +
                ", General Delivery: " + generalDelivery +
                ", Address Scanability: " + scannability +
                ", Address Readability: " + readability +
                ", Forwarding mail: " + forwarding +
                ", Address Address: " + address +
                ", Return address: " + returnAddress;
    }
    // Generate test Mail:
    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery= Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.forwarding = Enums.random(Forwarding.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }
    public static Iterable<Mail> generator(final int count) {
        return new Iterable<>() {
            int n = count;

            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }

                    @Override
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

