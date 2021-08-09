package com.homecompany.chapter17.exercise30;

import com.homecompany.chapter17.exercise29.Test;
import com.homecompany.chapter17.exercise29.TestParam;
import com.homecompany.chapter17.exercise29.Tester;
import util.Generated;
import util.RandomGenerator;

import java.util.*;

public class ListPerformanceSort {
    static List<Test<List<Integer>>> tests = new ArrayList<>();
    static {
        tests.add(new Test<>("sort") {
            @Override
            protected int test(List<Integer> container, TestParam tp) {
                int loops = tp.loops;
                int cSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    Collections.sort(container);
                    container.clear();
                    container.addAll(Arrays.asList(Generated.array(Integer.class, new RandomGenerator.Integer(), cSize)));
                }
                return loops;
            }
        });
    }
    static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container,
                          List<Test<List<Integer>>> tests) {
            super(container, tests);
        }
        // Fill to the appropriate size before each test:
        @Override protected List<Integer> initialize(int size){
            container.clear();
            container.addAll(Arrays.asList(Generated.array(Integer.class, new RandomGenerator.Integer(), size)));
            return container;
        }
        // Convenience method:
        public static void run(List<Integer> list,
                               List<Test<List<Integer>>> tests) {
            new ListPerformanceSort.ListTester(list, tests).timedTest();
        }
    }

    public static void main(String[] args) {
        Tester.defaultParams= TestParam.array(
                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
        ListPerformanceSort.ListTester.run(new ArrayList<>(), tests);
        ListPerformanceSort.ListTester.run(new LinkedList<>(), tests);
    }
}
