package com.homecompany.chapter14.exercise14;

import com.homecompany.factory.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part2 {
    public static List<Class<? extends Part>> partsFactory = new ArrayList<>();
    static {
        partsFactory.add(AirFilter.class);
        partsFactory.add(CabinAirFilter.class);
        partsFactory.add(FuelFilter.class);
        partsFactory.add(FanBelt.class);
        partsFactory.add(OilFilter.class);
        partsFactory.add(GeneratorBelt.class);
        partsFactory.add(PowerSteeringBelt.class);
    }
  /*  Part2 () {
        partsFactory = new ArrayList<>();
        partsFactory.add(new AirFilter());
        partsFactory.add(new CabinAirFilter());
        partsFactory.add(new FuelFilter());
        partsFactory.add(new FanBelt());
        partsFactory.add(new OilFilter());
        partsFactory.add(new GeneratorBelt());
        partsFactory.add(new PowerSteeringBelt());
    }*/
    private static Random rnd = new Random(47);
    public static Part createRandom (){
        Part p = null;
        int n = rnd.nextInt(partsFactory.size());
        try {
            p = partsFactory.get(n).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
