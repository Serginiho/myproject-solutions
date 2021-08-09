package com.homecompany.chapter19.exercise6;

import util.Enums;

public enum Meals3 {
    APPETIZER(Appetizer3.class), // no indication about implementation of Food3. it is not clear that this category
    MAINCOURSE(MainCourse3.class),
    DESERT(Desert3.class),
    HOTBEVERAGES(HotBeverages3.class),
    COLDBEVERAGES(ColdBeverages3.class);
    private Food3[] values;
    Meals3 (Class<? extends Food3> kind) {
        values = kind.getEnumConstants();
    }
    public Food3 randomSelection () {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meals3 m :
                    values()) {
                System.out.println(m.randomSelection());
            }
            System.out.println("----------");
        }
    }
}
