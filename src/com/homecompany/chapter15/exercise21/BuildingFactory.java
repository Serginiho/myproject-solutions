package com.homecompany.chapter15.exercise21;

public class BuildingFactory implements FactoryInterface<Building> {

    @Override
    public Building create() {
        return new Building();
    }
}
