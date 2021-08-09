package com.homecompany.chapter8.exercise3;

class Flute {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    void addRef (){refcount++;}
    Flute(){System.out.println("Конструктор Flute(): " + this);}
    @Override
    public String toString() {
        return "Ссылка: " + id;
    }
}
