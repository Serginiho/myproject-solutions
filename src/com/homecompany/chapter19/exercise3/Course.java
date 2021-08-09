package com.homecompany.chapter19.exercise3;

import util.Enums;

public enum Course {
    APPETTIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESERT(Food.Desert.class),
    HOTBEVERAGES(Food.HotBeverages.class),
    COLDBEVERAGES(Food.ColdBeverages.class);
    private Food[] values;
    Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }
    public Food randomSelection () {
        return Enums.random(values);
    }
}
