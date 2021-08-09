package com.homecompany.chapter17.exercise32;

import com.homecompany.chapter17.exercise29.ListPerformance;

import java.util.ArrayList;

public class TestCOI {
    public static void main(String[] args) {
        ListPerformance.ListTester.run(new ArrayList<>(), ListPerformance.tests);
        ListPerformance.ListTester.run(new ContainerOfInteger(), ListPerformance.tests);
    }
}
