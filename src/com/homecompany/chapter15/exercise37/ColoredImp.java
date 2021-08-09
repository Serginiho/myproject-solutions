package com.homecompany.chapter15.exercise37;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ColoredImp implements Colored{
    private static List<String> colorList = new LinkedList<>(Arrays.asList("White", "Red", "Black", "Orange"));
    private Random rand = new Random();
    @Override
    public String getColor() {
        return colorList.get(rand.nextInt(colorList.size()));
    }
}
