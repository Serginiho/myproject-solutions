package com.homecompany.chapter15.exercise38;

import com.homecompany.generics.Americano;
import com.homecompany.generics.Breve;
import com.homecompany.generics.Cappuccino;
import com.homecompany.generics.Latte;

class Decoration {
    public static void main(String[] args) {
        Foam f = new Foam(new Americano());
        Chocolate ch = new Chocolate(new Foam(new Latte()));
        Caramel caramel = new Caramel(new Chocolate(new Foam(new Cappuccino())));
        Cream cream = new Cream(new Caramel(new Chocolate(new Foam(new Breve()))));
        System.out.println(f + " " + f.getAdd());
        System.out.println(ch + " " + ch.getAdd());
        System.out.println(caramel + " " + caramel.getAdd());
        System.out.println(cream + " " + cream.getAdd());
    }
}
