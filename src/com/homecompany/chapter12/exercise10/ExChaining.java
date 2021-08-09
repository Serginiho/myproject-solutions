package com.homecompany.chapter12.exercise10;

import com.homecompany.chapter12.exercise4.MyException2;
import com.homecompany.chapter12.exercise9.Ex9Exception3;

class ExChaining {
    static void f() throws MyException2 {
        try {
            try {
                g();
            } catch (Ex9Exception3 e) {
                e.printStackTrace(System.out);
                throw new MyException2("из внутреннего блока try f()");
            }
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
    }

    static void g() throws Ex9Exception3 {
        throw new Ex9Exception3("Исключение Ex9Exception3 возбужено в g()");
    }

    public static void main(String[] args) throws MyException2 {
        f();
    }
}
