package com.homecompany.chapter9.exercise1;
//упражнение 9 (глава 8), 1(глава 9), 7(глава 9)
interface Rodent {
    void move();
    void eat();
 /*   abstract void move();
    abstract void eat();*/
    public static void main (String[] args){
        Rodent[] r = {
                new Mouse(),
                new Hamster(),
                new Squirrel()
        };
        for (Rodent rodent : r) {
            rodent.eat();
            rodent.move();
        }
    }
}
