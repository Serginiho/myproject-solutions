package com.homecompany.chapter5;

public class Money {
    Valuta description;
    public Money (Valuta description) {
        this.description = description;
    }
    protected void describe (){
        System.out.print("Эта валюта: ");
        switch (description){
            case RUB: System.out.println("Российский рубль"); break;
            case EUR: System.out.println("Европеская ЕВРО"); break;
            case USD: System.out.println("Американский Доллар"); break;
            case JPY: System.out.println("Японская Йена"); break;
            case AUD: System.out.println("Австралийский Доллар"); break;
            case XCD: System.out.println("Восточнокарибский доллар"); break;
        }

    }

}