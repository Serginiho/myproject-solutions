package com.homecompany.chapter15.exercise18;

import util.Generator;

class BigFish {
    private static long count = 1;
    private final long id = count++;
    private BigFish() {}

    @Override
    public String toString() {
        return "BigFish "+ id;
    }
    public static Generator<BigFish> bigFishGenerator = new Generator<>() {
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };
}
