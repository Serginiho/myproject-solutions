package com.homecompany.chapter14.exercise14;

public class RegisteredFactories {
    public static void main (String[] args){
        for (int i = 0; i<10; i++)
            System.out.println(i+1 + ": " + Part2.createRandom());
    }
}
