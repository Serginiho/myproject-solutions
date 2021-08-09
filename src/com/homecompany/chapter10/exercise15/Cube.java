package com.homecompany.chapter10.exercise15;

import java.util.Random;

class Cube implements Game {
    private Cube(){};
    Random rand = new Random ();
    @Override
    public void flip() {
        System.out.println("Cube trow: " + (rand.nextInt(6)+1));
    }
    public static GameFactory factory = new GameFactory() {
            @Override
            public Game getGame() {
                return new Cube();
            }
        };
    }

