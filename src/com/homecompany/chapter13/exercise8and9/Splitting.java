package com.homecompany.chapter13.exercise8and9;

import java.util.Arrays;

class Splitting {
    static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " + "with... a herring!";
    static void split (String regex){
        System.out.println(
                Arrays.toString(knights.split(regex,4))
        );
    }
    public static void main(String[] args){
        split("you\\W+");
        split("the\\W+");
        System.out.println(knights.replaceAll("[aAeEyYuUoOiI]","_"));
    }
}
