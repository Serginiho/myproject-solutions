package com.homecompany.chapter15.exercise28;

class Generic1<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Generic1{" +
                "item=" + item +
                '}';
    }
}
