package com.homecompany.chapter12.exercise2;

class ClassForException {
    void f () {
        System.out.println("Выполнение f()");
    }
    public static void main (String[] args){
        ClassForException cfe = new ClassForException();
        cfe = null;
        try {
            cfe.f();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Исключение поймано");
        }
    }
}
