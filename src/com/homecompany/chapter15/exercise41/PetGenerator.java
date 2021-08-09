package com.homecompany.chapter15.exercise41;

import com.homecompany.typeinfo.pets.Pet;
import com.homecompany.typeinfo.pets.Pets;
import util.Generator;

public class PetGenerator implements Generator<Pet> {
    public PetGenerator () {}
    @Override
    public Pet next() {
        try {
            return Pets.randomPet();
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
}
