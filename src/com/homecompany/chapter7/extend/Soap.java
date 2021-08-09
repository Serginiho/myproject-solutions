package com.homecompany.chapter7.extend;

class Soap extends Detergent {
    @Override
    public void scrub() {
        append(" Soap.scrub()");
        super.scrub();
    }
    public void sterilize () {append(" sterilize()");}
    public static void main (String[] args){
        Soap x = new Soap();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Проверка класса Detergent:");
        Detergent.main(args);
    }
}
