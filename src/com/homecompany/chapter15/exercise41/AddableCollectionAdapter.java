package com.homecompany.chapter15.exercise41;

import java.util.Collection;

public class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> t;
    public AddableCollectionAdapter (Collection<T> t){
        this.t = t;
    }
    @Override
    public void add(T item) {
        t.add(item);
    }
}
