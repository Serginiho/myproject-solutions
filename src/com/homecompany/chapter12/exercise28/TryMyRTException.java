package com.homecompany.chapter12.exercise28;

class TryMyRTException {
    void f () throws MyRTException{
        System.out.println("Возбуждаем MyRTException из f ()");
        throw new MyRTException("Сообщение об ошибке");
    }
    public static void main (String[] args){
        TryMyRTException tmrte = new TryMyRTException();
            tmrte.f();
    }
}
