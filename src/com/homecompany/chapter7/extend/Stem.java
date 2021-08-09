package com.homecompany.chapter7.extend;

public class Stem extends Root{
    private Component1 com1;
    private Component2 com2;
    private Component3 com3;
    Stem (int u){
        super(1);
        com1 = new Component1("Stem_component 1");
        com2 = new Component2("Stem_component 2");
        com3 = new Component3("Stem_component 3");
        System.out.println("Конструктор Stem" + " " + u);
    }
    @Override
    void dispose (){
        System.out.println("Stem.dispose()");
        com3.dispose("Stem_component 3");
        com2.dispose("Stem_component 2");
        com1.dispose("Stem_component 1");
        super.dispose();
    }
    public static void main (String[] args){
        Stem s = new Stem(2);
        s.dispose();
    }
}
