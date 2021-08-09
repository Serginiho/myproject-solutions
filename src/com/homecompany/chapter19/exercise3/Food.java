package com.homecompany.chapter19.exercise3;

public interface Food {
    enum Appetizer implements Food {
        SALAD, SUP, SPRING_ROLLS;
    }
    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALLO;
    }
    enum Desert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }
    enum HotBeverages implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }
    enum ColdBeverages implements Food {
        WATER, SPARKLING_WATER, PEPSI, COCA_COLA,
        FANTA, COLA_ZERO;
    }
}
