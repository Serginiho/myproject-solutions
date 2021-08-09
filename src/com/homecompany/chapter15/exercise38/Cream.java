package com.homecompany.chapter15.exercise38;

import com.homecompany.generics.Coffee;

class Cream extends CoffeeDecorator{
    private final String cream = "Cream";
    Cream(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getAdd () {return coffee.toString() + " " + cream;}
}
