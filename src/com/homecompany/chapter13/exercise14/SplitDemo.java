package com.homecompany.chapter13.exercise14;

import java.util.Arrays;

class SplitDemo {
    public static void main(String[] args){
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!",3)));
    }
}
