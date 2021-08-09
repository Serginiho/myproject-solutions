package com.homecompany.chapter14.exercise1;

public class Toy {
//  Без конструтора по умолчанию не возможно создать экземпляр с помощью newInstance
    public Toy(){}
    public Toy(int i){
        System.out.println("Конструктор toy: " + i);
    }
}
