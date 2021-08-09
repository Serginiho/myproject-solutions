package com.homecompany.chapter15.exercise28;

import com.homecompany.typeinfo.pets.Cat;
import com.homecompany.typeinfo.pets.EgyptianMau;
import com.homecompany.typeinfo.pets.Pet;

class TestWildCards {
    static <T> T genGetItem(Generic2<? extends T> g2) {
        return g2.getItem();
    }
    @SuppressWarnings("unchecked")
    static <T> void genSet (Generic1<? super T> g1, Generic2<? super T> g2, T item){
        g1.setItem(item);
        g2.item = (T)g1.item;
    }
    public static void main(String[] args) {
        Generic2<Pet> petGeneric2 = new Generic2<>();
        Generic1<Cat> catGeneric1 = new Generic1<>();
        genSet(catGeneric1,petGeneric2, new EgyptianMau("Balu"));
        Pet p = genGetItem(petGeneric2);
        System.out.println(p);
    }
}
