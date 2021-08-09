package com.homecompany.chapter7.extend;

class BoardGame extends Game {
    BoardGame () {
        super(12);
        System.out.println("Конструктор BoardGame по-умолчанию");}
    BoardGame (int f){
        super(f+=2);
        System.out.println("Конструктор BoardGame с аргументом");
    }
}
