package com.homecompany.chapter20.exercise4;

import util.atunit.AtUnit;
import util.atunit.Test;

public class TestForCreateObjectBeforeEachTestCase {
    private static long count;
    private final long id = count++;
    public TestForCreateObjectBeforeEachTestCase() {
        System.out.println("Created object of class #" + id);
    }
    public int plus (int x, int y){
        return x+y;
    }
    public int minus (int x, int y){
        return x-y;
    }
    public boolean equals (int x, int y){
        return x == y;
    }
    @Test
    boolean testingMethodPlus () {
        return plus(2, 2) == 4;
    }
    @Test
    boolean assertTestingMethodMinus (){
         int y = minus(5, 4);
        return equals(3,y);
    }
    @Test
    boolean testingMethodEquals () {
        return equals(2,3);
    }

    public static void main(String[] args) throws Exception {
        AtUnit.main(args);
    }
}
