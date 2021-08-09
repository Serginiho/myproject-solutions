package com.homecompany.chapter15.exercise38;

import com.homecompany.generics.Coffee;

class Caramel extends CoffeeDecorator{
    private final String caramel = "Caramel";
    Caramel(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getAdd () {return coffee.toString() + " " + caramel;}
}
