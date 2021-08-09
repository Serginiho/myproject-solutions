package com.homecompany.chapter15.exercise18;

import util.Generator;

class LittleFish {
    private static long count = 1;
    private final long id = count++;
    private LittleFish () {}

    @Override
    public String toString() {
        return "LittleFish " + id;
    }
    public static Generator<LittleFish> littleFishGenerating () {
        return new Generator<>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
