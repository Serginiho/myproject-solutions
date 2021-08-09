package com.homecompany.chapter15.exercise34;

class TestClass extends SelfBounded<TestClass>{
    TestClass tc;
    @Override
    TestClass setAndGet(TestClass arg) {
        tc = arg;
        return tc;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "tc=" + tc.getClass().getSimpleName() +
                '}';
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        TestClass tc2 = tc.getElement(tc);
        System.out.println(tc2);
    }
}
