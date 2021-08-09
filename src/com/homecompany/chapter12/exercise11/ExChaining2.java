package com.homecompany.chapter12.exercise11;

import com.homecompany.chapter12.exercise9.Ex9Exception3;

class ExChaining2 {
    static void f() {
            try {
                g();
            } catch (Ex9Exception3 e) {
                throw new RuntimeException(e);
            }
    }

    static void g() throws Ex9Exception3 {
        throw new Ex9Exception3("Исключение Ex9Exception3 возбужено в g()");
    }
    public static void main(String[] args) {
        f();
    }
}
