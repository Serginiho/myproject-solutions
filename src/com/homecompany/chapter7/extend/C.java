package com.homecompany.chapter7.extend;

public class C extends A {
    C () {
        super (4);
        System.out.println("Конструктор C");
    }
    @Override
     int result (int i){
        System.out.println("result(B)");
        return 2;
    }
    public static void main (String[] args){
        C n = new C();
        n.result(1);
        n.result(2);
        n.result(3.0f);
        n.result('m');
    }
}