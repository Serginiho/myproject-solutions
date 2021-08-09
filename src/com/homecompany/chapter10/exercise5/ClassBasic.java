package com.homecompany.chapter10.exercise5;

class ClassBasic {
    ClassBasic (){System.out.println("ClassBasic");}
    class InClassBasic {
        InClassBasic (){System.out.println("InClassBasic");}
        ClassBasic getClassBasic (){return ClassBasic.this;}
    }
}
