package com.homecompany.chapter7.extend;

public class Beetle2 extends Beetle{
    private int v = printInt("Поле Beetle2.v инициализировано");
    public Beetle2 (){
        super();
        System.out.println("Конструктор Beetle2");
        System.out.println("v= " + v);
        System.out.println("j= " + j);
    }
    private static int x3 = printInt("Поле static Beetle2.x3 инициализировано");
    public static void main(String[] args){
 //        System.out.println("Конструктор Beetle2");
        Beetle2 b = new Beetle2();
        System.out.println("x1= "+ x1 + " , " +"x2= " + x2 + " , "+ "x3= "+ x3);
    }
}

