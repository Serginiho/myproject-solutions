package com.homecompany.chapter14.exercise15;

import com.homecompany.typeinfo.pets.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PetCreatorFactory {
    private Random rand = new Random(47);
    // The List of the different types of Pet to create:
    private List<Class<? extends Pet>> types;
    public PetCreatorFactory (){
        types = new ArrayList<>();
        types.add(Gerbil.class);
        types.add(EgyptianMau.class);
        types.add(Hamster.class);
        types.add(Manx.class);
        types.add(Mutt.class);
        types.add(Mouse.class);
        types.add(Cymric.class);
    }
    public Pet randomPet() { // Create one random Pet
        Pet p = null;
        int n = rand.nextInt(types.size());
        try {
            p = types.get(n).getDeclaredConstructor().newInstance();
        } catch(InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return p;
    }
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
