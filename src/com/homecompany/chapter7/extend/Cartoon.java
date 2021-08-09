package com.homecompany.chapter7.extend;

public class Cartoon extends Drawing {
    Cartoon () {System.out.println("Конструктор Cartoon");}
    public static void main (String[] args){
        Cartoon x = new Cartoon();
    }
}
