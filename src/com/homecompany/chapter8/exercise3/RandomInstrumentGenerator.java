package com.homecompany.chapter8.exercise3;

import com.homecompany.chapter9.exercise4.Playable;

import java.util.Random;

class RandomInstrumentGenerator {
    private Random rnd = new Random(100);
    public Playable next(){
        switch (rnd.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringer();
            case 3: return new WoodWind();
            case 4: return new Brass();
            case 5: return new Guitar();
        }
    }
}
