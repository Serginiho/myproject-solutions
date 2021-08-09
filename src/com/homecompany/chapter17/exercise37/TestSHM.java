package com.homecompany.chapter17.exercise37;

import com.homecompany.chapter17.exercise19.SimpleHashMap;
import com.homecompany.chapter17.exercise29.TestParam;
import com.homecompany.chapter17.exercise29.Tester;
import com.homecompany.chapter17.exercise35.MapPerformance;

public class TestSHM {
    public static void main(String[] args) {
        if (args.length>0)
            Tester.defaultParams = TestParam.array(args);
        Tester.run(new SimpleHashMap<>(), MapPerformance.tests);
        Tester.run(new SimpleHashMap7<>(), MapPerformance.tests);

    }
}
