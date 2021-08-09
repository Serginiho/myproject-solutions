package com.homecompany.chapter15.exercise3;

import com.homecompany.factory.GeneratorBelt;
import com.homecompany.factory.OilFilter;
import com.homecompany.factory.Part;
import com.homecompany.generics.Americano;
import com.homecompany.generics.Breve;
import com.homecompany.generics.Cappuccino;
import com.homecompany.generics.Coffee;
import com.homecompany.typeinfo.pets.Dog;
import com.homecompany.typeinfo.pets.EgyptianMau;
import com.homecompany.typeinfo.pets.Gerbil;
import com.homecompany.typeinfo.pets.Pet;

public class TupleTest {
    static TwoTuple<Integer, String> f () {
        return new TwoTuple<>(12, "String");
    }
    static ThreeTuple<Pet, Integer, String> g () {
        return new ThreeTuple<>(new Dog(), 12, "String");
    }
    static FourTuple<Coffee, Pet, Integer, String> h(){
        return new FourTuple<>(new Americano(), new Dog(), 12, "String");
    }
    static FiveTuple<Part, Coffee, Pet, Integer, String> j() {
        return new FiveTuple<>(new GeneratorBelt(),new Cappuccino(), new Gerbil(), 12, "String");
    }
    static SixTuple<Double, Part, Coffee, Pet, Integer, String> k(){
        return new SixTuple<>(12.4, new OilFilter(), new Breve(), new EgyptianMau("Hoku"), 12, "String");
    }
    public static void main(String[] args){
        System.out.println("2 types: [" + f() + "]");
        System.out.println("3 types: [" + g() + "]");
        System.out.println("4 types: [" + h() + "]");
        System.out.println("5 types: [" + j() + "]");
        System.out.println("6 types: [" + k() + "]");
    }
}
