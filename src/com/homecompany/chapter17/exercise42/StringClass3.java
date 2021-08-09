package com.homecompany.chapter17.exercise42;

import com.homecompany.chapter17.exercise40.StringClass;
import util.CollectionData;
import util.Generated;
import util.Generator;
import util.RandomGenerator;

import java.util.*;

class StringClass3 extends StringClass {
    StringClass3 (String s1, String s2) {
        super(s1, s2);
    }
    static RandomGenerator.String rgs = new RandomGenerator.String();
    public static Generator<StringClass3> generator () {
        return new Generator<>() {
            @Override
            public StringClass3 next() {
                return new StringClass3(rgs.next(), rgs.next());
            }
        };
    }

    public static void main(String[] args) {
        StringClass3 [] sc3 = Generated.array(StringClass3.class, generator(), 20);
        List<StringClass3> list3 = new ArrayList<>(CollectionData.list(generator(), 20));
        System.out.println("Array: " + Arrays.toString(sc3));
        System.out.println("List: " + list3);
        System.out.println("-----------");
        System.out.println("After sort:");
        Arrays.sort(sc3, Comparator.naturalOrder());
        Collections.sort(list3, Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(sc3));
        System.out.println("List: " + list3);
    }
}
