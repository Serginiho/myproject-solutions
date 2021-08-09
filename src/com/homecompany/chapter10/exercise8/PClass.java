package com.homecompany.chapter10.exercise8;

public class PClass {
    private class PI3Class implements PInterface{
        @Override
        public void show() {
            System.out.println("Закрытый внутренний класс");
        }
    }
    PInterface pInterface (){
        class PIClass implements PInterface{

            @Override
            public void show() {
                System.out.println("Локальный класс в методе");
            }
        }
        return new PIClass(){
            {System.out.print("Аннонимный класс: ");}
        };
    }
    void method (boolean b){
        if (b){
            class PI2Class implements PInterface{

                @Override
                public void show() {
                    System.out.println("Локальный класс в области действия метода");
                }
            }
            PI2Class pi2c = new PI2Class();
            pi2c.show();
        }
 //       PI2Class pi2c = new PI2Class(); // не возможно создать экземпляр класса за пределами области действия
    }
    public PInterface pInterface2(){
        return new PI3Class();
    }

}
