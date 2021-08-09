package com.homecompany.chapter11.exercise32;

import com.homecompany.typeinfo.pets.Pet;
import org.jetbrains.annotations.NotNull;

import java.util.*;

class NonCollectionSequence extends PetSequence implements Iterable<Pet>{

    @NotNull
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }
    public Iterable<Pet> reversed () {
        return new Iterable<>() {
            @NotNull
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<>() {
                    private int index = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }
                };
            }
        };
    }
    public Iterable<Pet> randomized (){
        return new Iterable<>() {
            @NotNull
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(50));
                return shuffled.iterator();
            }
        };
    }
    public static void main (String[] args){
        NonCollectionSequence ncs = new NonCollectionSequence();
        System.out.println("Прямой:");
        for (Pet p:
             ncs) {
            System.out.print(p + "; ");
        }
        System.out.println();
        System.out.println("Обратный:");
        for (Pet p:
             ncs.reversed()) {
            System.out.print(p + "; ");
        }
        System.out.println();
        System.out.println("Перемешанный:");
        for (Pet p:
             ncs.randomized()) {
            System.out.print(p + "; ");
        }
    }
}
