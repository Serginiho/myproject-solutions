package com.homecompany.chapter15.exercise19;

import java.util.ArrayList;

class Ship extends ArrayList<Aisle> {
    public Ship(int nAisle, int nContainer, int nCargo) {
        for (int i = 0; i < nAisle; i++) {
            add(new Aisle(nContainer,nCargo));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle a:
             this) {
            for (Container c:
                 a) {
                for (Cargo ca:
                     c) {
                    result.append(ca);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Ship(5, 30, 100));
    }
}
