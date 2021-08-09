package com.homecompany.chapter17.exercise35;

import com.homecompany.chapter17.exercise15.SlowMap;
import com.homecompany.chapter17.exercise29.Test;
import com.homecompany.chapter17.exercise29.TestParam;
import com.homecompany.chapter17.exercise29.Tester;

import java.util.*;

public class MapPerformance {
    public static List<Test<Map<Integer, Integer>>> tests = new ArrayList<>();
    static {
        tests.add(new Test<Map<Integer, Integer>>("put") {
            @Override
            protected int test(Map<Integer, Integer> container, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    container.clear();
                    for (int j = 0; j < size; j++) {
                        container.put(j, j);
                    }
                }
                return loops*size;
            }
        });
        tests.add(new Test<Map<Integer, Integer>>("get") {
            @Override
            protected int test(Map<Integer, Integer> container, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size*2;
                for (int i = 0; i < loops; i++) {
                    for (int j = 0; j < span; j++) {
                        container.get(j);
                    }
                }
                return loops*span;
            }
        });
//        tests.add(new Test<Map<Integer, Integer>>("iterate") {
//            @Override
//            protected int test(Map<Integer, Integer> container, TestParam tp) {
//                int loops = tp.loops*10;
//                for (int i = 0; i < loops; i++) {
//                    Iterator<Map.Entry<Integer, Integer>> it = container.entrySet().iterator();
//                    while (it.hasNext())
//                        it.next();
//                }
//                return loops*container.size();
//            }
//        });
    }

    public static void main(String[] args) {
        Tester.run(new TreeMap<>(), tests);
        Tester.run(new HashMap<>(), tests);
        Tester.run(new LinkedHashMap<>(), tests);
        Tester.run(new IdentityHashMap<>(), tests);
        Tester.run(new WeakHashMap<>(), tests);
        Tester.run(new Hashtable<>(), tests);
        TestParam[] params = TestParam.array(10, 100, 100, 100, 1000, 100, 10000, 100);
        Tester.run(new SlowMap<>(), tests, params);
    }
}
