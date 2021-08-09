package com.homecompany.chapter15.exercise14;

import com.homecompany.generics.Coffee;
import util.BasicGenerator;
import util.Generator;

public class DemoBasicGenerator {
    public static void main(String[] args) {
        Generator<Coffee> gen = new BasicGenerator<>(Coffee.class);
        for (int i=0;i<5;i++)
            System.out.println(gen.next());
    }
}
