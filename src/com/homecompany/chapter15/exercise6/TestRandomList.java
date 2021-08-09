package com.homecompany.chapter15.exercise6;

import com.homecompany.generics.Coffee;
import com.homecompany.generics.RandomList;

public class TestRandomList {
    public static void main (String[] args){
        RandomList<Integer> rs1 = new RandomList<>();
        for (int i=0; i<20; i++)
            rs1.add(i);
        for (int i=0; i<5;i++)
            System.out.println(rs1.select());
        RandomList<Coffee> rs2 = new RandomList<>();
        for (int i=0; i<20; i++)
            rs2.add(new Coffee());
        for (int i=0; i<5;i++)
            System.out.println(rs2.select());
    }
}
