package com.homecompany.chapter15.exercise4;

class Sequence<T> {
    private T[] items;
    private int next = 0;
    public Sequence(int size) {
        items = (T[]) new Object[size];
    }
    public void add(T x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector<T> {
        private int i = 0;
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public T current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector<T> selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence<>(10);
        for(int i = 0; i < 10; i++)
            sequence.add("s");
        Selector<String> selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
