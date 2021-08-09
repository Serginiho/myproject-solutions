package com.homecompany.chapter15.exercise38;

import com.homecompany.generics.Coffee;

class Chocolate extends CoffeeDecorator{
    private final String chocolate = "Chocolate";
    Chocolate(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getAdd () {return coffee.toString() + " " + chocolate;}

}
