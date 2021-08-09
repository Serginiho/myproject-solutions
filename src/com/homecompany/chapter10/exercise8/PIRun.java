package com.homecompany.chapter10.exercise8;

public class PIRun {
    public static void main(String[] args){
        PClass pc = new PClass();
//        pc.pInterface();
        pc.pInterface().show();
        pc.method(true);
        pc.pInterface2().show();
 //       PClass.PI3Class pi3c = pc.new PI3Class(); //закрытый внутренний класс не доступен, только через метод pInterface2()
 //       pi3c.show();
    }
}
