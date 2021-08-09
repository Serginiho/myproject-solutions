package com.homecompany.chapter7.extend;

class Cleanser {
    Cleanser () {System.out.println("Конструктор Cleanser");}
    private String s = "Cleanser";
    public void append (String a){ s+=a; }
    public void dilute (){append(" dilute()");}
    public void apply () {append(" apply()");}
    public void scrub () {append(" scrub()");}
    public String toString (){return s;}
    public static void main (String[] args){
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.print(x);
    }
}
