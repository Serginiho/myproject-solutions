package com.homecompany.chapter15.exercise21;

public class HouseFactory implements FactoryInterface<House> {
    @Override
    public House create() {
        return new House();
    }
}
