package com.homecompany.chapter17.exercise34;

import com.homecompany.chapter17.exercise29.Test;
import com.homecompany.chapter17.exercise29.TestParam;
import com.homecompany.chapter17.exercise29.Tester;
import util.Generated;
import util.RandomGenerator;

import java.util.*;

public class SetPerformance {
    static List<Test<Set<String>>> tests = new ArrayList<>();
    static String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
    static {
        tests.add(new Test<Set<String>>("add") {
            @Override
            protected int test(Set<String> container, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    container.clear();
                    for (int j = 0; j < size; j++) {
                        container.add(s[0] + j);
                    }
                }
                return loops*size;
            }
        });
        tests.add(new Test<Set<String>>("contains") {
            @Override
            protected int test(Set<String> container, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size*2;
                for (int i = 0; i < loops; i++) {
                    for (int j = 0; j < span; j++) {
                        container.contains(s[0] + j);
                    }
                }
                return loops*span;
            }
        });
        tests.add(new Test<Set<String>>("iterate") {
            @Override
            protected int test(Set<String> container, TestParam tp) {
                int loops = tp.loops;
                for (int i = 0; i < loops; i++) {
                    Iterator<String> it = container.iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops*container.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
           Tester.defaultParams = TestParam.array(args);
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<>(), tests);
        Tester.run(new HashSet<>(), tests);
        Tester.run(new LinkedHashSet<>(), tests);
    }
}
