package com.homecompany.chapter15.exercise37;

public class SerialNumberedImp implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter++;
    @Override
    public long getSerialNumber() { return serialNumber; }
}
