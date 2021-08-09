package com.homecompany.chapter7.extend;

class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("Конструктор Insect");
        System.out.println("i = " + i + " , "+ "j= "+ j);
        j=39;
    }
    static int x1=printInt("Поле static Insect.x1 инициализировано");
    static int printInt(String s){
        System.out.println(s);
        return 47;
    }
}
