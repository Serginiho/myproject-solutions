package com.homecompany.chapter19.exercise11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemToSell {
    private String name;
    private int value;
    ItemToSell (String name, int value) {
        this.name = name;
        this.value = value;
    }
    public static ItemToSell parse (String line){
        String[] s = line.split(":");
        return new ItemToSell(s[0], Integer.parseInt(s[1]));
    }
    private static List<ItemToSell> items = new ArrayList<>();
    public static void addItem (ItemToSell item) {
        items.add(item);
    }
    public static ItemToSell findItem (String name) {
        for (ItemToSell its:
             items) {
            if(its.name.equals(name))
                return its;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    private static Random random = new Random();
    public static ItemToSell randomSelection () {
        return items.get(random.nextInt(items.size()));
    }
}
