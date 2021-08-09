package com.homecompany.chapter11.chapterexemple;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id () {return id;}
}
