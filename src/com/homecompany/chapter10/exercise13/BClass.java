package com.homecompany.chapter10.exercise13;

public class BClass {
    AClass1 getAc1(final String s,final int x){
        return new AClass1(s,x){
            {
            System.out.print("Аннонимный класс");}
        };
    }
    public static void main(String[] args){
        BClass bc = new BClass();
        bc.getAc1("Test", 10);
    }
}
