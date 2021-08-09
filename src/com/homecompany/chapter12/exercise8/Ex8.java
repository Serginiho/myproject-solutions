package com.homecompany.chapter12.exercise8;

import com.homecompany.chapter12.exercise4.MyException2;

class Ex8 {
    static void ex () throws MyException2 {
        throw new MyException2("MyException2 throws");
    }
    public static void main (String[] args){
        try {
            ex();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
    }
}
