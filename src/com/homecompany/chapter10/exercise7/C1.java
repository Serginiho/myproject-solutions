package com.homecompany.chapter10.exercise7;

class C1 {
    private int i; // защищиенные поля и методы внешнего класса доступны для изменения и использования во внутреннем классе
    private void getI(){System.out.println(i);}
    class C2{
//        private String s = "Private";
        void showI(int s){
            i = s;
            getI();
        }
    }
    void screen(int p){
        new C2().showI(p);
//        System.out.println(s); //защищенные поля внутреннего класса не доступны для внешнего класса
    }
    public static void main(String[] args){
        C1 c1 = new C1();
        c1.screen(2);
    }
}
