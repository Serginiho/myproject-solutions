package com.homecompany.chapter15.exercise19;

import util.Generator;

import java.util.Random;

class Cargo {
    private final int id;
    private String name;
    private double weight;

    public Cargo(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cargo: " +
                "id " + id +
                ", " + name +
                ", " + weight +
                " kg";
    }
    public static Generator<Cargo> cargoGenerator = new Generator<>() {
        private Random rand = new Random();
        @Override
        public Cargo next() {
            return new Cargo(rand.nextInt(1000), "Test cargo", Math.round(rand.nextDouble()*100.0));
        }
    };
}
