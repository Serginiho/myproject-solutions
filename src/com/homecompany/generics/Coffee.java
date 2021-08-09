package com.homecompany.generics;

public class Coffee {
    private String val;
    private static long counter = 0;
    private final long id = counter++;
    public Long get () {return id;}
    public void setAdd (String val) {
        this.val = val;
    }
    public void modVal (String s) {
        this.val = id + s;
    }
    public String getAdd () {return val;}
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
