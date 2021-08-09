package com.homecompany.typeinfo.pets;

import com.homecompany.chapter14.exercise15.PetCreatorFactory;

import java.util.ArrayList;

public class Pets {
 /*   public static final PetCreator creator =
            new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }*/
    public static final PetCreatorFactory creator = new PetCreatorFactory();
    public static Pet randomPet (){
        return creator.randomPet();
    }
    public static Pet[] createArray (int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
