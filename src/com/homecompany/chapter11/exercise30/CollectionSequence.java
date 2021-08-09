package com.homecompany.chapter11.exercise30;

import com.homecompany.typeinfo.pets.Pet;
import com.homecompany.typeinfo.pets.Pets;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;

class CollectionSequence implements Collection<Pet> {
    private Pet [] pets = Pets.createArray(8);

    @Override
    public @NotNull Iterator<Pet> iterator() {
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

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return pets;
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Pet pet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main (String[] args){
        CollectionSequence cs = new CollectionSequence();
        DisplayInterface.display(cs);
        System.out.println(cs.isEmpty());
    }
}
