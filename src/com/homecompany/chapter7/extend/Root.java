package com.homecompany.chapter7.extend;

class Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;
    Root(int i){System.out.println("Конструктор Root");
    c1 = new Component1("Root_component 1");
    c2 = new Component2("Root_component 2");
    c3 = new Component3("Root_component 3");}
    void dispose (){
        c3.dispose("Root_component 3");
        c2.dispose("Root_component 2");
        c1.dispose("Root_component 1");
        System.out.println("Завершение Root");
    }
}
