package com.homecompany.chapter14.exercise10;

import java.util.Arrays;

class Primitive {
    public static void main (String[] args){
        char [] c = {'a','b','c'};
        System.out.println(c.getClass().getSimpleName() +
                        "; примитив? [" + c.getClass().isPrimitive() +
                        "]; Родительский класс: " + c.getClass().getSuperclass() +
                "; поля: " + Arrays.toString(c.getClass().getDeclaredFields()));
    }
}
