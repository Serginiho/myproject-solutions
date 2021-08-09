package com.homecompany.chapter3;

import java.util.Random;

public class Coin {
    String tailOfCoin;
    public static void main (String[] arg) {
    Random rd = new Random ();
    Coin c = new Coin();
    int i = rd.nextInt(2);
       if (i == 0) {
           c.tailOfCoin = "Reshka";
       } else {
           c.tailOfCoin = "Orel";
       }
       System.out.println("Tail of coin is " + c.tailOfCoin);
    }
}
