package com.homecompany.chapter10.exercise18;

interface MyInterface {
    boolean g();
    boolean p();
    class InClass{
        public static void h(MyInterface mi){
            mi.g();
            mi.p();
            System.out.println(mi.g());
            System.out.println(mi.p());

        }
    }

}
