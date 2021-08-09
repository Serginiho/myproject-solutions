package com.homecompany.chapter17.exercise31;

import com.homecompany.chapter17.exercise29.ListOfStringPerformance;

import java.util.ArrayList;

public class TestCOS {
    public static void main(String[] args) {
        ListOfStringPerformance.ListTester.run(new ArrayList<>(), ListOfStringPerformance.tests);
        ListOfStringPerformance.ListTester.run(new ContainerOfString(), ListOfStringPerformance.tests);
    }
}
