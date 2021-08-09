package com.homecompany.chapter7.extend;

class A {
    A (int i) {System.out.println("Вызов конструктора A" + i);}
    int result (int q){
        System.out.println("result(int)");
        return 2;
    }
    float result (float e){
        System.out.println("result(float)");
        return 2.0f;
    }
    char result (char t){
        System.out.println("result(char)");
        return 't';
    }
}
