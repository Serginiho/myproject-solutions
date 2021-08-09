package com.homecompany.chapter4;

public class IfElse {
    static int test (int begin, int end, int testVal, int target){
     if (testVal >= begin && testVal <= end && testVal > target) return +1;
     if (testVal >= begin && testVal <= end && testVal < target) return -1;
         else return 0;
    }
    public static void main (String[] args){
        System.out.println(test(0,20,10,5));
        System.out.println(test(5,20,21,50));
        System.out.println(test(-20,5,-10,10));
    }
}
