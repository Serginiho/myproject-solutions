package com.homecompany.chapter17.exercise29;

import util.Generated;
import util.RandomGenerator;

import java.util.*;

public class ListOfStringPerformance {
    static Random rand = new Random();
    static int reps = 1000;
    public static List<Test<List<String>>> tests =
            new ArrayList<>();
    static List<Test<LinkedList<String>>> qTests =
            new ArrayList<>();
    static {
        tests.add(new Test<>("add") {
            @Override
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++)
                        list.add(s[0]);
                }
                return loops * listSize;
            }
        });
        tests.add(new Test<>("get") {
            @Override
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test<>("set") {
            @Override
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
                for (int i = 0; i < loops; i++)
                    list.set(rand.nextInt(listSize), s[0]);
                return loops;
            }
        });
        tests.add(new Test<>("iteradd") {
            @Override
            protected int test(List<String> list, TestParam tp) {
                final int LOOPS = 1000000;
                int half = list.size() / 2;
                String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
                ListIterator<String> it = list.listIterator(half);
                for (int i = 0; i < LOOPS; i++)
                    it.add(s[0]);
                return LOOPS;
            }
        });
        tests.add(new Test<>("insert") {
            @Override
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
                for (int i = 0; i < loops; i++)
                    list.add(5, s[0]); // Minimize random-access cost
                return loops;
            }
        });
        tests.add(new Test<>("remove") {
            @Override
            protected int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(Arrays.asList(Generated.array(String.class, new RandomGenerator.String(),size)));
                    while (list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
        // Tests for queue behavior:
        qTests.add(new Test<>("addFirst") {
            @Override
            protected int test(LinkedList<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addFirst(s[0]);
                }
                return loops * size;
            }
        });
        qTests.add(new Test<>("addLast") {
            @Override
            protected int test(LinkedList<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                String[] s = Generated.array(String.class, new RandomGenerator.String(), 1);
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addLast(s[0]);
                }
                return loops * size;
            }
        });
        qTests.add(
                new Test<>("rmFirst") {
                    @Override
                    protected int test(LinkedList<String> list, TestParam tp) {
                        int loops = tp.loops;
                        int size = tp.size;
                        for (int i = 0; i < loops; i++) {
                            list.clear();
                            list.addAll(Arrays.asList(Generated.array(String.class, new RandomGenerator.String(), size)));
                            while (list.size() > 0)
                                list.removeFirst();
                        }
                        return loops * size;
                    }
                });
        qTests.add(new Test<>("rmLast") {
            @Override
            protected int test(LinkedList<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(Arrays.asList(Generated.array(String.class, new RandomGenerator.String(), size)));
                    while (list.size() > 0)
                        list.removeLast();
                }
                return loops * size;
            }
        });
    }
    public static class ListTester extends Tester<List<String>> {
        public ListTester(List<String> container,
                          List<Test<List<String>>> tests) {
            super(container, tests);
        }
        // Fill to the appropriate size before each test:
        @Override protected List<String> initialize(int size){
            container.clear();
            container.addAll(Arrays.asList(Generated.array(String.class, new RandomGenerator.String(), size)));
            return container;
        }
        // Convenience method:
        public static void run(List<String> list,
                               List<Test<List<String>>> tests) {
            new ListOfStringPerformance.ListTester(list, tests).timedTest();
        }
    }
    public static void main(String[] args) {
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        // Can only do these two tests on an array:
        Tester<List<String>> arrayTest =
                new Tester<>(null, tests.subList(1, 3)) {
                    // This will be called before each test. It
                    // produces a non-resizeable array-backed list:
                    @Override
                    protected List<String> initialize(int size) {
                        String[] ia = Generated.array(String.class,
                                new RandomGenerator.String(), size);
                        return Arrays.asList(ia);
                    }
                };
        arrayTest.setHeadline("Array as List");
        arrayTest.timedTest();
        Tester.defaultParams= TestParam.array(
                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListOfStringPerformance.ListTester.run(new ArrayList<>(), tests);
        ListOfStringPerformance.ListTester.run(new LinkedList<>(), tests);
        ListOfStringPerformance.ListTester.run(new Vector<>(), tests);
        Tester.fieldWidth = 12;
        Tester<LinkedList<String>> qTest =
                new Tester<>(
                        new LinkedList<>(), qTests);
        qTest.setHeadline("Queue tests");
        qTest.timedTest();
    }
}
