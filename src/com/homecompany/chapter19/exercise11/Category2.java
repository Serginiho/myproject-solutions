package com.homecompany.chapter19.exercise11;

import java.util.EnumMap;

import static com.homecompany.chapter19.exercise11.Input2.*;


enum Category2 {
    MONEY(NICKEL, DIME, QUARTER, DOLLAR),
    ITEM_SELECTION(ITEM),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);
    private Input2[] values;
    Category2(Input2... types) { values = types; }
    private static EnumMap<Input2, Category2> categories =
            new EnumMap<>(Input2.class);
    static {
        for(Category2 c : Category2.class.getEnumConstants())
            for(Input2 type : c.values)
                categories.put(type, c);
    }
    public static Category2 categorize(Input2 input) {
        return categories.get(input);
    }
}
