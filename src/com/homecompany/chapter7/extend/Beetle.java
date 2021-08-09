package com.homecompany.chapter7.extend;

public class Beetle extends Insect{
    private int k = printInt("Поле Beetle.k инициализировано");
    public Beetle(){
        super();
        System.out.println("Конструктор Beetle");
        System.out.println("k= " + k);
        System.out.println("j= " + j);
    }
    static int x2 = printInt("Поле static Beetle.x2 инициализировано");
    public static void main(String[] args){
 //       System.out.println("Конструктор Beetle");
        Beetle b = new Beetle();
        System.out.println("x1= "+ x1 + " , " +"x2= " + x2);
    }
}
