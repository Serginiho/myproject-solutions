package com.homecompany.chapter18.exercise27;

import java.io.Serializable;

public class ClassForSerializable2 implements Serializable {
    private int number;
    public ClassForSerializable2 () {}
    public ClassForSerializable2 (int x) {
        number = x;
    }

    @Override
    public String toString() {
        return "ClassForSerializable2{" +
                "number=" + number +
                '}';
    }
}
