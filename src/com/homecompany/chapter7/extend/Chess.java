package com.homecompany.chapter7.extend;

public class Chess extends BoardGame {
    Chess (){
        super(11);
        System.out.println("Конструктор Chess");
        BoardGame b = new BoardGame();
    }
    public static void main (String[] args){
        Chess c = new Chess();
    }

}
