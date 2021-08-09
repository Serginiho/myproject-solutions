package com.homecompany.chapter9.exercise9;

import java.util.Random;

class Cube implements Game{
    Random rand = new Random ();
    @Override
    public void flip() {
        System.out.println("Cube trow: " + rand.nextInt(6));
    }
}
