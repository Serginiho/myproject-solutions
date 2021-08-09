package com.homecompany.chapter17.exercise41;

import org.jetbrains.annotations.NotNull;
import util.CollectionData;
import util.Generator;
import util.RandomGenerator;

import java.util.*;

class StringClass2 implements Comparable<StringClass2>{
    String s1, s2;
    StringClass2 (String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "[" + s1 + "=" + s2 + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringClass2 that = (StringClass2) o;
        return s1.equals(that.s1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s1);
    }

    @Override
    public int compareTo(@NotNull StringClass2 o) {
        return this.s1.compareTo(o.s1);
    }
    static RandomGenerator.String rgs = new RandomGenerator.String();
    public static Generator<StringClass2> generator () {
        return new Generator<StringClass2>() {
            @Override
            public StringClass2 next() {
                return new StringClass2(rgs.next(), rgs.next());
            }
        };
    }
    public static void main(String[] args) {
        Map<StringClass2, Integer> hm = new HashMap<>();
        Generator<StringClass2> gen = generator();
        Set<StringClass2> hs = new HashSet<>(CollectionData.list(gen, 20));
        for (int i = 0; i < 20; i++) {
           hm.put(gen.next(), i);
        }
        System.out.println("Set: " + hs);
        System.out.println("Map: " + hm);
    }
}
