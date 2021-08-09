package com.homecompany.chapter19.exercise4;

import util.Enums;

public enum Meals2 {
    APPETTIZER(Food2.Appetizer2.class),
    MAINCOURSE(Food2.MainCourse2.class),
    DESERT(Food2.Desert2.class),
    HOTBEVERAGES(Food2.HotBeverages2.class),
    COLDBEVERAGES(Food2.ColdBeverages2.class);
    public interface Food2 {
        enum Appetizer2 implements Food2 {
            SALAD, SUP, SPRING_ROLLS;
        }
        enum MainCourse2 implements Food2 {
            LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALLO;
        }
        enum Desert2 implements Food2 {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE,
            FRUIT, CREME_CARAMEL;
        }
        enum HotBeverages2 implements Food2 {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
        enum ColdBeverages2 implements Food2 {
            WATER, SPARKLING_WATER, PEPSI, COCA_COLA,
            FANTA, COLA_ZERO;
        }
    }
    private Food2[] values;
    Meals2 (Class<? extends Food2> kind) {
        values = kind.getEnumConstants();
    }
    public Food2 randomSelection () {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meals2 m:
                 Meals2.values()) {
                Food2 food2 = m.randomSelection();
                System.out.println(food2);
            }
            System.out.println("---------");
        }
    }
}
