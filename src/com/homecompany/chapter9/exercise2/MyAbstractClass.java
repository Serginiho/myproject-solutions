package com.homecompany.chapter9.exercise2;
//упражение 2
abstract class MyAbstractClass {
    abstract void print();
    MyAbstractClass (){
        print();
    }
    public static void main(String[]args){
 //       MyAbstractClass mac = new MyAbstractClass(); //невозможно инициализоровать пустой абстрактный класс
        SubClass1 sc1 = new SubClass1();
        SubClass2 sc2 = new SubClass2();
        sc1.print();
        sc2.print();
    }
}
