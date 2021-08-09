package com.homecompany.chapter20.exercise6;

import util.atunit.AtUnit;
import util.atunit.Test;

import java.util.LinkedList;

public class LinkedListTestAtUnit {
    LinkedList<Integer> testList;
    public LinkedListTestAtUnit () {
        this.testList = new LinkedList<>();
        testList.add(2);
    }
    @Test
    boolean initialization () {
        return !testList.isEmpty();
    }
    @Test
    boolean testAdd () {
        testList.add(4);
        return testList.contains(4);
    }
    @Test
    boolean testRemove() {
        Integer[] a = {3,5};
        for (Integer i:
             a) {
            testList.addLast(i);
        }
        return testList.remove(a[1]);
    }

    @Test
    boolean testClear () {
        for (int i = 0; i < 10; i++) {
            testList.addLast(i);
        }
        testList.clear();
        return testList.isEmpty();
    }


    public static void main(String[] args) throws Exception {
        AtUnit.main(args);
    }
}
