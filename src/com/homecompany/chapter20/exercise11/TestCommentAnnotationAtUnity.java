package com.homecompany.chapter20.exercise11;

import com.homecompany.chapter20.exercise4.TestForCreateObjectBeforeEachTestCase;
import util.atunit.AtUnit;
import util.atunit.Test;
import util.atunit.TestComment;

public class TestCommentAnnotationAtUnity {
    TestForCreateObjectBeforeEachTestCase testCase = new TestForCreateObjectBeforeEachTestCase();
    @Test
    @TestComment("check realization for TestComment annotation")
    boolean _methodPlus () {
        return testCase.plus(2,10) == 12;
    }
    @Test
    boolean _methodMinus () {return testCase.minus(12, 10) == 2;}

    public static void main(String[] args) {
        try {
            AtUnit.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
