package com.homecompany.chapter17.exercise38;

import com.homecompany.chapter17.exercise29.Tester;
import com.homecompany.chapter17.exercise35.MapPerformance;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

class TestLoadFactor {
    public static void main(String[] args) throws NoSuchFieldException {
        MathContext mc = new MathContext(2);
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < 50; i++) {
            map1.put(i, i);
        }
        System.out.println("map1 size: " + map1.size());
        System.out.println("Load factor map1: " + new BigDecimal(map1.size(),mc).divide(new BigDecimal(16, mc), mc));
        Map<Integer,Integer> map2 = new HashMap<>(64);
        map2.putAll(map1);
        System.out.println("map2 size: " + map2.size());
        System.out.println("Load factor map2: " + new BigDecimal(map2.size(),mc).divide(new BigDecimal(64, mc), mc));
        Tester.run(map1, MapPerformance.tests);
        Tester.run(map2, MapPerformance.tests);
    }
}
