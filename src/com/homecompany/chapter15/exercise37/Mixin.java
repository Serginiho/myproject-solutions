package com.homecompany.chapter15.exercise37;

public class Mixin extends BasicImp implements TimeStamped, SerialNumbered, Colored{
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber =
            new SerialNumberedImp();
    private Colored colored = new ColoredImp();
    @Override
    public long getStamp() {
        return timeStamp.getStamp();
    }
    @Override
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
    @Override
    public String getColor() {
        return colored.getColor();
    }
}
