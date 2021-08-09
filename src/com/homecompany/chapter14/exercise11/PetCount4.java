package com.homecompany.chapter14.exercise11;

import com.homecompany.typeinfo.pets.Pet;
import com.homecompany.typeinfo.pets.Pets;
import util.TypeCounter;

public class PetCount4 {
    public static void main (String[] args){
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet: Pets.createArray(25)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
