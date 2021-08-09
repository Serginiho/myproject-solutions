package com.homecompany.chapter19.exercise2;

import java.util.Random;

public enum CartoonCharacters {
    SLAPPY, SPANKY, PANCHY, SILLY, BOUNCY, NUTTY, BOB;
    static Random random = new Random();
    public static CartoonCharacters next () {
        return values()[random.nextInt(values().length)];
    }
}
