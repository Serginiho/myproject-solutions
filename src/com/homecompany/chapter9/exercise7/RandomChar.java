package com.homecompany.chapter9.exercise7;

import java.util.Random;

class RandomChar {
    private static Random rand = new Random(100);
    char next(){
        return (char) rand.nextInt();
    }
}
