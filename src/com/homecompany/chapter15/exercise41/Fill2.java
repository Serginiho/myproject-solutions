package com.homecompany.chapter15.exercise41;

import util.Generator;

public class Fill2 {
    public static <T> void fill (Addable<T> addable, Generator<T> generator, int size){
        for (int i = 0; i < size; i++) {
            addable.add(generator.next());
        }
    }
}
