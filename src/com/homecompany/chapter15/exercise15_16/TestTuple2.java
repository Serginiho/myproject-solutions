package com.homecompany.chapter15.exercise15_16;

import com.homecompany.factory.FanBelt;
import com.homecompany.factory.OilFilter;
import com.homecompany.factory.PowerSteeringBelt;
import com.homecompany.generics.*;
import com.homecompany.typeinfo.pets.Dog;
import com.homecompany.typeinfo.pets.Gerbil;
import util.SixTuple;

import static util.Tuple.tuple;

public class TestTuple2 {
    static util.TwoTuple<String, Integer> f() {
        return tuple("String2", 2);
    }
    static util.TwoTuple<String, Integer> f2() {
        return tuple("String2", 2);
    }
    static util.ThreeTuple<Americano, String, Integer> g() {
        return tuple(new Americano(), "String3", 3);
    }
    static util.FourTuple<OilFilter, Cappuccino, String, Integer> h() {
        return tuple(new OilFilter(), new Cappuccino(), "String 4", 4);
    }
    static util.FiveTuple<Gerbil, PowerSteeringBelt, Latte, String, Integer> k() {
        return tuple(new Gerbil(), new PowerSteeringBelt(), new Latte(), "String 5", 5);
    }
    static SixTuple<Double, FanBelt, Dog, Mocha, String, Integer> l() {
        return tuple(6.6, new FanBelt(),new Dog(), new Mocha(),"String 6", 6 );
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
//        TwoTuple<String, Integer> ttsi = f2(); Unchecked assignment
//       System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}
