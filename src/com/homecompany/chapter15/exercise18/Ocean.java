package com.homecompany.chapter15.exercise18;

import com.homecompany.chapter15.exercise13.Generators;

import java.util.*;

class Ocean {
    public static void eat (BigFish bf, LittleFish lf) {
        System.out.println(bf + " eats " + lf);
    }
    public static void main(String[] args) {
        Random rand = new Random();
        List<LittleFish> littleFishList = new ArrayList<>();
        Generators.fill(littleFishList, LittleFish.littleFishGenerating(), 25);
        List<BigFish> bigFishList = new ArrayList<>();
        Generators.fill(bigFishList, BigFish.bigFishGenerator, 10);
        for (LittleFish lf: littleFishList){
            eat(bigFishList.get(rand.nextInt(bigFishList.size())), lf);
        }
    }
}
