package com.homecompany.chapter15.exercise19;

import java.util.ArrayList;

class Aisle extends ArrayList<Container> {
    public Aisle(int nContainer, int nCargo) {
        for (int i = 0; i < nContainer; i++) {
            add(new Container(nCargo));
        }
    }
}
