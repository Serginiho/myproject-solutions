package com.homecompany.chapter15.exercise29;

import com.homecompany.generics.Holder;
import com.homecompany.typeinfo.pets.EgyptianMau;
import com.homecompany.typeinfo.pets.Pet;

import java.util.LinkedList;
import java.util.List;

public class TestHolder {
    static void f(Holder<List<?>> listHolder, List<?> arg){
        listHolder.set(arg);
        List<?> list = listHolder.get();
        System.out.println(listHolder);
        System.out.println(list);
        System.out.println(listHolder.equals(arg));
    }
    static void h(List<Holder<?>> holderList, Holder<?> holder, int arg) {
        holderList.add(holder); // Не возможно
        Holder<?> h = holderList.get(arg);
        System.out.println(holderList);
        System.out.println(h.get());
        System.out.println(holderList.equals(holder));
    }

    public static void main(String[] args) {
        Holder<List<?>> listHolder = new Holder<>(new LinkedList<>());
        List<String> ls = new LinkedList<>();
        ls.add("String1");
        ls.add("String 2");
        f(listHolder, ls);
        System.out.println();
        List<Holder<?>> holderList = new LinkedList<>();
        Holder<Pet> petHolder = new Holder<>(new EgyptianMau("H"));
        h(holderList, petHolder, 0);
    }
}
