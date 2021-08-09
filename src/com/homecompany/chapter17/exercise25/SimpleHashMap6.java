package com.homecompany.chapter17.exercise25;

import util.Countries;

import java.util.*;

public class SimpleHashMap6<K,V> extends AbstractMap<K,V> {
    private static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    Entry<K,V>[] buckets = new Entry[SIZE];
    private static class Entry<K,V> implements Map.Entry<K,V>{
        private K key;
        private V value;
        Entry<K,V> next;
        Entry (K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return Objects.equals(key, entry.key) && Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {
            return key.hashCode()^(value == null ? 0 : value.hashCode());
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode())%SIZE;
        Entry<K,V> newPair = new Entry<>(key, value);
        if(buckets[index] == null)
            buckets[index] = newPair;
        Entry<K,V> prevPair = null; //предыдущий узел
        boolean found = false;
        for (Entry<K,V> pair = buckets[index]; pair != null; pair = pair.next) {
            if (pair.getKey().equals(key)){
                oldValue = pair.getValue();
            if (prevPair != null)
                prevPair = pair.next;
            else
                buckets[index] = newPair;
            newPair.next = pair.next;
            found = true;
            break;
            }
            prevPair = pair;
        }
        if (!found)
            prevPair.next = newPair;
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode())%SIZE;
        for (Entry<K,V> pair = buckets[index]; pair != null; pair = pair.next) {
            if (pair.getKey().equals(key))
                return pair.getValue();
        }
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> entrySet = new HashSet<>();
        for (Entry<K,V> bucket : buckets) {
            for (Entry<K,V> pair = bucket; pair != null; pair = pair.next) {
                entrySet.add(pair);
            }
        }
        return entrySet;
    }
    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        buckets = new Entry[SIZE];
    }

    @Override
    public V remove(Object key) {
        int index = Math.abs(key.hashCode())%SIZE;
        Entry<K,V> prevPair = null;
        V value;
        for (Entry<K,V> pair = buckets[index]; pair != null; pair = pair.next) {
            if (pair.getKey().equals(key)) {
                value = pair.getValue();
                if (prevPair != null)
                    prevPair.next = pair.next;
                else
                    buckets[index] = null;
                return value;
            }
        }
        return null;
    }

    @Override
    public int size() {
        int sz = 0;
        for (Entry<K,V> bucket: buckets) {
            for (Entry<K,V> pair = bucket; pair != null; pair = pair.next)
                sz++;
        }
        return sz;
    }

    @Override
    public boolean isEmpty() {
        for (Entry<K,V> bucket: buckets) {
            if (bucket != null)
                return false;
        }
        return true;
    }

    @Override
    public boolean containsKey(Object key) {
        for (Entry<K,V> bucket: buckets) {
            for (Entry<K,V> pair = bucket; pair != null; pair = pair.next)
                if (pair.getKey().equals(key))
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SimpleHashMap6<String, String> shm6 = new SimpleHashMap6<>(),
                shm7 = new SimpleHashMap6<>();
        shm6.putAll(Countries.capitals(20));
        System.out.println("shm6: " + shm6);
        System.out.println("shm6 size: " + shm6.size());
        System.out.println("shm6 get EGYPT: " + shm6.get("EGYPT"));
        System.out.println("shm6 contains EGYPT: " + shm6.containsKey("EGYPT"));
        System.out.println("shm6 contains CAMEROON: " + shm6.containsKey("CAMEROON"));
        System.out.println("shm6 is empty: " + shm6.isEmpty());
        System.out.println("remove \"CAMEROON\" from shm6");
        shm6.remove("CAMEROON");
        System.out.println("shm6 contains CAMEROON: " + shm6.containsKey("CAMEROON"));
        shm6.putAll(Countries.capitals(20));
        shm7.putAll(Countries.capitals(20));
        System.out.println("shm7: " + shm7);
        System.out.println("Try add the same shm7 into shm6");
        shm6.putAll(shm7);
        System.out.println("shm6: " + shm6);
        System.out.println("shm6 size: " + shm6.size());
        System.out.println("shm6 clear");
        shm6.clear();
        System.out.println("shm6 is empty: " + shm6.isEmpty());
    }
}
