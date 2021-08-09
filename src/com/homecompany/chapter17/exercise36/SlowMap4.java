package com.homecompany.chapter17.exercise36;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SlowMap4<K,V> extends AbstractMap<K,V> {
    private List<Entry<K,V>> storage = new ArrayList<>();
    private static class Entry<K,V> implements Map.Entry<K,V>, Comparable<K>{
        private K key;
        private V value;
        Entry(K key, V value) {
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
            return key.equals(entry.key) && value.equals(entry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

        @Override
        public int compareTo(@NotNull K item) {
            return Integer.compare(this.key.hashCode(), item.hashCode());
        }
    }

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        Entry<K,V> pair = new Entry<>(key, value);
        if (storage.isEmpty())
            storage.add(pair);
        for (Entry<K,V> entry:
             storage) {
            if (entry.getKey().equals(key)) {
                oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        storage.add(pair);
        return oldValue;
    }

    @Override
    public V get(Object key) {
        for (Entry<K,V> entry:
             storage) {
            if (entry.getKey().equals(key))
                return entry.getValue();
        }
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new HashSet<>(storage);
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public void clear() {
        storage = new ArrayList<>();
    }

    public static void main(String[] args) {
        SlowMap4<Integer,String> map = new SlowMap4<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "String " + i);
        }
        map.put(9, "String 10");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(9));
        map.clear();
        System.out.println(map);
        System.out.println(map.keySet());
    }
}
