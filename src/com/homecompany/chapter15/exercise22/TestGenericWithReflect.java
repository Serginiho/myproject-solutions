package com.homecompany.chapter15.exercise22;

import com.homecompany.chapter14.exercise1.Toy;
import com.homecompany.chapter15.exercise21.House;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

class TestGenericWithReflect<T> {
    private Class<T> kind;
    TestGenericWithReflect (Class<T> kind) {
        this.kind = kind;
    }
     Object createNewObject (Object...args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         Constructor<?>[] cons = kind.getDeclaredConstructors();
         Class<?>[] param = new Class[args.length];
         for (Constructor<?> con : cons) {
             if (con.getParameterCount() == args.length)
                 param = con.getParameterTypes();
         }
         System.out.println("constructors: " + Arrays.toString(cons));
         System.out.println("type parameter: " + Arrays.toString(param));
         return kind.getConstructor(param).newInstance(args);
    }
    public static void main(String[] args) {
        TestGenericWithReflect<House> withReflect = new TestGenericWithReflect<>(House.class);
        TestGenericWithReflect<Toy> toyTestGenericWithReflect = new TestGenericWithReflect<>(Toy.class);
        try {
            System.out.println(withReflect.createNewObject( "Russia", "Home", 12));
            System.out.println();
            System.out.println(toyTestGenericWithReflect.createNewObject(1));
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
