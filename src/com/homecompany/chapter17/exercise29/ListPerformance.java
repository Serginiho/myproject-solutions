package com.homecompany.chapter17.exercise29;

import util.CountingAndSkipGenerator;
import util.CountingIntegerList;
import util.Generated;

import java.util.*;

public class ListPerformance {
    static Random rand = new Random();
    static int reps = 1000;
    public static List<Test<List<Integer>>> tests =
            new ArrayList<>();
    static List<Test<LinkedList<Integer>>> qTests =
            new ArrayList<>();
    static {
        tests.add(new Test<>("add") {
            @Override
            protected int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++)
                        list.add(j);
                }
                return loops * listSize;
            }
        });
        tests.add(new Test<>("get") {
            @Override
            protected int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test<>("set") {
            @Override
            protected int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.set(rand.nextInt(listSize), 47);
                return loops;
            }
        });
        tests.add(new Test<>("iteradd") {
            @Override
            protected int test(List<Integer> list, TestParam tp) {
                final int LOOPS = 1000000;
                int half = list.size() / 2;
                ListIterator<Integer> it = list.listIterator(half);
                for (int i = 0; i < LOOPS; i++)
                    it.add(47);
                return LOOPS;
            }
        });
        tests.add(new Test<>("insert") {
            @Override
            protected int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                for (int i = 0; i < loops; i++)
                    list.add(5, 47); // Minimize random-access cost
                return loops;
            }
        });
        tests.add(new Test<>("remove") {
            @Override
            protected int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
        // Tests for queue behavior:
        qTests.add(new Test<>("addFirst") {
            @Override
            protected int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addFirst(47);
                }
                return loops * size;
            }
        });
        qTests.add(new Test<>("addLast") {
            @Override
            protected int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addLast(47);
                }
                return loops * size;
            }
        });
        qTests.add(
                new Test<>("rmFirst") {
                    @Override
                    protected int test(LinkedList<Integer> list, TestParam tp) {
                        int loops = tp.loops;
                        int size = tp.size;
                        for (int i = 0; i < loops; i++) {
                            list.clear();
                            list.addAll(new CountingIntegerList(size));
                            while (list.size() > 0)
                                list.removeFirst();
                        }
                        return loops * size;
                    }
                });
        qTests.add(new Test<>("rmLast") {
            @Override
            protected int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 0)
                        list.removeLast();
                }
                return loops * size;
            }
        });
    }
    public static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container,
                          List<Test<List<Integer>>> tests) {
            super(container, tests);
        }
        // Fill to the appropriate size before each test:
        @Override protected List<Integer> initialize(int size){
            container.clear();
            container.addAll(new CountingIntegerList(size));
            return container;
        }
        // Convenience method:
        public static void run(List<Integer> list,
                               List<Test<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }
    public static void main(String[] args) {
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        // Can only do these two tests on an array:
        Tester<List<Integer>> arrayTest =
                new Tester<>(null, tests.subList(1, 3)) {
                    // This will be called before each test. It
                    // produces a non-resizeable array-backed list:
                    @Override
                    protected List<Integer> initialize(int size) {
                        Integer[] ia = Generated.array(Integer.class,
                                new CountingAndSkipGenerator.Integer(), size);
                        return Arrays.asList(ia);
                    }
                };
        arrayTest.setHeadline("Array as List");
        arrayTest.timedTest();
        Tester.defaultParams= TestParam.array(
                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<>(), tests);
        ListTester.run(new LinkedList<>(), tests);
        ListTester.run(new Vector<>(), tests);
        Tester.fieldWidth = 12;
        Tester<LinkedList<Integer>> qTest =
                new Tester<>(
                        new LinkedList<>(), qTests);
        qTest.setHeadline("Queue tests");
        qTest.timedTest();
    }
}
