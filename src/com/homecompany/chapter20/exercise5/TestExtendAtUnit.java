package com.homecompany.chapter20.exercise5;

import com.homecompany.chapter20.exercise4.TestForCreateObjectBeforeEachTestCase;
import util.atunit.AtUnit;
import util.atunit.Test;

public class TestExtendAtUnit extends TestForCreateObjectBeforeEachTestCase {
    @Test
    boolean testingPlus (){
        return equals(3, plus(10, 5));
    }
    @Test
    boolean testingMinus () {
        return equals(5, minus(10,5));
    }

    public static void main(String[] args) throws Exception {
        AtUnit.main(args);
    }
}
