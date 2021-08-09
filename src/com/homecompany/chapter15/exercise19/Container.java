package com.homecompany.chapter15.exercise19;

import com.homecompany.chapter15.exercise13.Generators;

import java.util.ArrayList;

class Container extends ArrayList<Cargo> {
    public Container(int nCargo) {
        Generators.fill(this, Cargo.cargoGenerator, nCargo);
    }
}
