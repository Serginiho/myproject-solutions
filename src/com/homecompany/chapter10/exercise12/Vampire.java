package com.homecompany.chapter10.exercise12;

class Vampire implements Lethal{
    void drinkBlood(){
        System.out.println("drinkBlood");
    };
    @Override
    public void kill() {
        System.out.println("kill");
    }
}
