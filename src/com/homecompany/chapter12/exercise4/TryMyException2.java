package com.homecompany.chapter12.exercise4;

class TryMyException2 {
    void f () throws MyException2{
        System.out.println("Возбуждаем MyException2 из f ()");
        throw new MyException2("Сообщение об ошибке");
    }
    public static void main (String[] args){
        TryMyException2 tme2 = new TryMyException2();
        try{
            tme2.f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Исключение поймано");
        }
    }
}
