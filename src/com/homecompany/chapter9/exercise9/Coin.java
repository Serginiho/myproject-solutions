package com.homecompany.chapter9.exercise9;

import java.util.Random;

class Coin implements Game{
     Random rand = new Random ();
    @Override
    public void flip() {
        switch (rand.nextInt(2)) {
            case 0:
                System.out.println("Coin: Reshka");break;
            case 1:
                System.out.println("Coin: Orel");break;
            default:System.out.println("Coin on Edge");break;
        }
    }
}
