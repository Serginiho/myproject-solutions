package com.homecompany.chapter15.exercise41;

import com.homecompany.typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class Fill2Test {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();
        Fill2.fill(Adapter.collectionAdapter(petList), new PetGenerator(), 10);
        for (Pet p:
             petList) {
            System.out.println(p);
        }
    }
}
