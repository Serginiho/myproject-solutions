package com.homecompany.chapter10.exercise1;

public class Outer {
    private String s;
    Outer (String x){
        System.out.println("Outer Class");
        s = x;
    }
     class Inner{
        Inner (){
            System.out.println("Inner Class");
        }

        @Override
        public String toString() {
            return s;
        }
    }
    Inner get(){return new Inner();}
    public static void main (String[] args){
        Outer out = new Outer("Outer");
        System.out.println(out.get().toString());
    }
}
