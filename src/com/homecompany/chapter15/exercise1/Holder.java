package com.homecompany.chapter15.exercise1;

import com.homecompany.typeinfo.pets.Dog;
import com.homecompany.typeinfo.pets.Mutt;
import com.homecompany.typeinfo.pets.Pet;

public class Holder<T> {
    private T a;
    public Holder (T a) {
        this.a = a;
    }
    void set (T a) {
        this.a = a;
    }
    T get () {
        return a;
    }

    public static void main (String[] args){
        Holder<Pet> h = new Holder<>(new Pet("Null"));
        System.out.println(h.get());
        h.set(new Mutt("Mike"));
        System.out.println(h.get());
        h.set(new Dog("Spike"));
        System.out.println(h.get());
    }
}
