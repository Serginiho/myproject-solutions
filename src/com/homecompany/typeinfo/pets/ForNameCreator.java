package com.homecompany.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "com.homecompany.typeinfo.pets.Mutt",
            "com.homecompany.typeinfo.pets.Pug",
            "com.homecompany.typeinfo.pets.EgyptianMau",
            "com.homecompany.typeinfo.pets.Manx",
            "com.homecompany.typeinfo.pets.Cymric",
            "com.homecompany.typeinfo.pets.Rat",
            "com.homecompany.typeinfo.pets.Mouse",
            "com.homecompany.typeinfo.pets.Hamster",
            "com.homecompany.typeinfo.pets.Gerbil"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for(String name : typeNames)
                types.add(
                        (Class<? extends Pet>)Class.forName(name));
        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    @Override
    public List<Class<? extends Pet>> types() {return types;}
}
