package com.homecompany.chapter19.exercise11;

public class ExtendedInput {
    private ItemToSell item;
    Input2 input2;
    ExtendedInput (ItemToSell item, Input2 input2) {
        this.item = item;
        this.input2 = input2;
    }
    public int amount () {
        return item != null ? item.getValue() : input2.amount();
    }

    @Override
    public String toString() {
        return item != null ? item.getName() : input2.toString();
    }
}
