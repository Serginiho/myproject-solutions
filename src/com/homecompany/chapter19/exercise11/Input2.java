package com.homecompany.chapter19.exercise11;

import java.util.Random;

enum Input2 {
    NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
    ITEM,
    ABORT_TRANSACTION {
        @Override
        public int amount() { // Disallow
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP { // This must be the last instance.
        @Override
        public int amount() { // Disallow
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    };
    int value; // In cents
    Input2(int value) { this.value = value; }
    Input2() {}
    int amount() { return value; }; // In cents
    static Random rand = new Random(47);
    public static Input2 randomSelection() {
        // Don't include STOP:
        return values()[rand.nextInt(values().length - 1)];
    }
}
