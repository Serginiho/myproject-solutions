package com.homecompany.chapter15.exercise33;

import java.util.ArrayList;
import java.util.List;

public class FixedSizeStack2<T> {
    private int index;
    private List<Object> storage;
    public FixedSizeStack2 () {
        storage = new ArrayList<>();
    }
    public void push (T item) {
        storage.add(item);
        this.index = storage.size();
    }
    @SuppressWarnings("unchecked")
    public T pop () {
        return (T) storage.get(--index);
    }
}
