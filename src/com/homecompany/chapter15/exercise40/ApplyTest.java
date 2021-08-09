package com.homecompany.chapter15.exercise40;

import com.homecompany.typeinfo.pets.Pet;
import com.homecompany.typeinfo.pets.Pets;

import java.util.List;

public class ApplyTest {
    public static void main(String[] args) throws Exception{
        List<Pet> pets = Pets.arrayList(10);
        Apply.apply(pets, Pet.class.getMethod("speak"));
    }
}
