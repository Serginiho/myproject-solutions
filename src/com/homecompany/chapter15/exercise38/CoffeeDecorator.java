package com.homecompany.chapter15.exercise38;

import com.homecompany.generics.Coffee;

public class CoffeeDecorator extends Coffee {
    protected Coffee coffee;
    CoffeeDecorator (Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getAdd() {return coffee.getAdd();
    }
}
