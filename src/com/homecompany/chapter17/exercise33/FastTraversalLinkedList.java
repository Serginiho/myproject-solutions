package com.homecompany.chapter17.exercise33;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class FastTraversalLinkedList<V> extends AbstractList<V> {
    private class FlaggedArrayList {
        private FlaggedLinkedList companion;
        boolean changed = false;
        private ArrayList<V> list = new ArrayList<>();
        public void addCompanion (FlaggedLinkedList other) {
            companion = other;
        }
        private void synchronize(){
            if (companion.changed)
                list = new ArrayList<>(companion.list);
            companion.changed = false;
        }
        public V get (int index) {
            synchronize();
            return list.get(index);
        }
        public int size () {
            synchronize();
            return list.size();
        }
        public V set(int index, V v) {
            synchronize();
            changed = true;
            return list.set(index, v);
        }
        public V remove (int index) {
            synchronize();
            changed = true;
            return list.remove(index);
        }
        public boolean remove (Object item) {
            synchronize();
            changed = true;
            return list.remove(item);
        }
        public void clear () {
            list.clear();
            changed = false;
        }

    }
    private class FlaggedLinkedList {
        private FlaggedArrayList companion;
        boolean changed = false;
        private LinkedList<V> list = new LinkedList<>();
        public void addCompanion(FlaggedArrayList other) {
            companion = other;
        }
        private void synchronize () {
            if (companion.changed)
                list = new LinkedList<>(companion.list);
            companion.changed = false;
        }
        public void add (int index, V v){
            synchronize();
            changed = true;
            list.add(index, v);
        }
        public boolean add (V v) {
            synchronize();
            changed = true;
            return list.add(v);
        }
        public Iterator<V> iterator () {
            synchronize();
            return list.iterator();
        }
        public void clear () {
            list.clear();
            changed = false;
        }
    }
    private FlaggedArrayList aList = new FlaggedArrayList();
    private FlaggedLinkedList lList = new FlaggedLinkedList();
    {
        aList.addCompanion(lList);
        lList.addCompanion(aList);
    }

    @Override
    public V get(int index) {
        return aList.get(index);
    }

    @Override
    public int size() {
        return aList.size();
    }

    @Override
    public void add(int index, V element) {
        lList.add(index, element);
    }

    @Override
    public V set(int index, V element) {
        return aList.set(index, element);
    }

    @Override
    public boolean add(V v) {
       return lList.add(v);
    }

    @Override
    public V remove(int index) {
        return aList.remove(index);
    }

    @Override
    public Iterator<V> iterator() {
        return lList.iterator();
    }

    @Override
    public void clear() {
        aList.clear();
        lList.clear();
    }
}
