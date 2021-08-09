package com.homecompany.chapter14.exercise16;

import com.homecompany.generics.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoffeeFactory {
    static List<Class<? extends Coffee>> types = new ArrayList<>();
    static {
        types.add(Americano.class);
        types.add(Breve.class);
        types.add(Cappuccino.class);
        types.add(Latte.class);
        types.add(Mocha.class);
    }
    private static Random rand = new Random(47);
    public static Coffee getRandomCoffee () throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        int n = rand.nextInt(types.size());
        return types.get(n).getDeclaredConstructor().newInstance();
    }
}
