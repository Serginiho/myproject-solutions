package com.homecompany.chapter15.exercise42;

import com.homecompany.generics.Coffee;
import com.homecompany.generics.CoffeeGenerator;
import com.homecompany.chapter15.exercise41.Adapter;
import com.homecompany.chapter15.exercise41.Fill2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Functional {
    public static <R,T> List<R> transform (Iterable<T> seq, UnaryFunction<R,T> func){
        List<R> result = new ArrayList<>();
        for (T t: seq)
            result.add(func.function(t));
        return result;
    }
    public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred){
        List<T> result = new ArrayList<>();
        for (T t: seq){
            if (pred.test(t))
                result.add(t);
        }
        return result;
    }
    public static class CoffeeSetVal implements UnaryFunction<String, Coffee>{
        private static String[] val = {"a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x",
                "c", "v", "b", "n", "m", "q", "w", "e", "r", "t", "y", "u", "i",
        "o", "p"};
        private static Random rand = new Random();
        @Override
        public String function(Coffee x) {
            x.setAdd(val[rand.nextInt(val.length)]);
            return x.getAdd();
        }
    }
    public static class CoffeeModVal implements UnaryFunction <String,Coffee>{
        private static String[] val = {"a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x",
                "c", "v", "b", "n", "m", "q", "w", "e", "r", "t", "y", "u", "i",
                "o", "p"};
        private static Random rand = new Random();
        @Override
        public String function(Coffee x) {
            x.modVal(val[rand.nextInt(val.length)]);
            return x.getAdd();
        }
    }
    public static class CoffeeFilter<T extends Comparable<T>> implements UnaryPredicate<T>{
        private T bound;
        CoffeeFilter (T bound) {
            this.bound = bound;
        }
        @Override
        public boolean test(T x) {
            return x.compareTo(bound) > 0;
        }
    }
    public static void main(String[] args) {
        List<Coffee> coffees = new ArrayList<>();
        Fill2.fill(Adapter.collectionAdapter(coffees), new CoffeeGenerator(), 10);
        System.out.println(transform(coffees,new CoffeeSetVal()));
        System.out.println(transform(coffees, new CoffeeModVal()));
        List<String> stringList = transform(coffees,new CoffeeModVal());
        System.out.println(stringList);
        System.out.println(filter(stringList, new CoffeeFilter<>("4o")));
    }
}
