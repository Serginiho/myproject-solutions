package com.homecompany.chapter15.exercise38;

import com.homecompany.generics.Coffee;

class Foam extends CoffeeDecorator{
    private final String foam = "Foam";
    Foam(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getAdd() {return coffee.toString() + " " + foam;}

}
