package com.homecompany.chapter10.exercise19;

import java.util.Arrays;

class B {
    private U[] linkU;
    private int next = 0;
    public B (int size){
        linkU = new U[size];
    }
    public void add (A a){
        if(next < linkU.length) {
            linkU[next++] = a.getU();
            System.out.println(Arrays.toString(linkU));
        }
        else {System.out.println("Достигнут предел массива");}
    }
    public void delete (int i){
        if(i>=0 && i< linkU.length){
                linkU[i] = null;
            System.out.println("Элемент " + i + " удален");
        }
        else {System.out.println("Элемент " + i + " не найден");}
    }
    public void use (){
        for (int i = 0; i< linkU.length; i++)
            if(linkU[i] != null){
            linkU[i].f();
            linkU[i].g();
            linkU[i].h();}
        else {System.out.println("Ссылок на интервейс U не найдено");}
        }
    public static void main(String[] args){
        B b = new B(2);
        A a1 = new A();
        A a2 = new A();
       A a3 = new A();
 /*        A a4 = new A();
        A a5 = new A();*/
        b.add(a1);
        b.add(a2);
        b.add(a3);
 /*       b.add(a4);
        b.add(a5);*/
        b.use();
        b.delete(1);
        b.delete(10);
        b.delete(-2);
//        b.delete(0);
        b.use();
    }
}
