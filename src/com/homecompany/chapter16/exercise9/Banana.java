package com.homecompany.chapter16.exercise9;

class Banana {
    private static long count;
    private final long id=count++;

    @Override
    public String toString() {
        return "Banana "+ id;
    }
}
