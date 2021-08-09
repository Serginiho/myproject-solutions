package com.homecompany.chapter7.extend;

public class Detergent extends Cleanser{
    Detergent () {System.out.println("Конструктор Detergent");}
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam () {append(" foam()");}
    public static void main (String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Проверка базового класса:");
        Cleanser.main(args);
    }
}
