package com.homecompany.chapter17.exercise36;

import com.homecompany.chapter17.exercise29.TestParam;
import com.homecompany.chapter17.exercise29.Tester;
import com.homecompany.chapter17.exercise35.MapPerformance;

import java.util.HashMap;

public class TestSlowMap4 {
    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.run(new SlowMap4<>(), MapPerformance.tests);
        Tester.run(new SlowMap5<>(), MapPerformance.tests);
        Tester.run(new HashMap<>(), MapPerformance.tests);
    }
}
