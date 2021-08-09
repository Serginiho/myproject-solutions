package com.homecompany.chapter17.exercise33;

import com.homecompany.chapter17.exercise29.ListPerformance;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestFTLL {
    public static void main(String[] args) {
        ListPerformance.ListTester.run(new ArrayList<>(), ListPerformance.tests);
        ListPerformance.ListTester.run(new LinkedList<>(), ListPerformance.tests);
        ListPerformance.ListTester.run(new FastTraversalLinkedList<>(), ListPerformance.tests);
    }
}
