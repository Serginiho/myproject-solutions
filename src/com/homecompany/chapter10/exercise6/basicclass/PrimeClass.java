package com.homecompany.chapter10.exercise6.basicclass;

import com.homecompany.chapter10.exercise6.inter.Sample;

public class PrimeClass {
    protected class SubPrimeClass implements Sample{

        @Override
        public void show() {
            System.out.println("Метод внутреннего класса SubPrimeClass");
        }
    }
    public Sample sample(){return new SubPrimeClass();}
}
