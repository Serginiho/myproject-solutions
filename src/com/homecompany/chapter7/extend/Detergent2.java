package com.homecompany.chapter7.extend;

public class Detergent2 {
    Detergent2 () {System.out.println("Конструктор Detergent2");}
    Cleanser c = new Cleanser();
 /*   public void dilute2 (){c.append(" dilute2()");}
    public void apply2 () {c.append(" apply2()");}
    public void scrub2 () {c.append(" Detergent.scrub2()");}
    public void foam2 () {c.append(" foam2()");}
    public String toString (){
        return c.toString();
    }
*/
    public void dilute() {
        c.dilute();
    }

    public void apply() {
        c.apply();
    }

    public void scrub() {
        c.scrub();
    }
    public String toString (){
        return c.toString();}

    public static void main (String[] args){
        Detergent2 d2 = new Detergent2();
        d2.dilute();
        d2.apply();
        d2.scrub();
//        d2.foam2();
        System.out.println(d2);
    }
}
