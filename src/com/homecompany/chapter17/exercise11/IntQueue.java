package com.homecompany.chapter17.exercise11;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

class IntQueue implements Comparable<IntQueue>{
    private int i;
    IntQueue () {
        Random random = new Random();
        i = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "IntQueue[" + i +
                ']';
    }

    @Override
    public int compareTo(@NotNull IntQueue o) {
        return Integer.compare(i, o.i);
    }
}
