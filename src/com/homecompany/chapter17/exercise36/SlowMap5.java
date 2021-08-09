package com.homecompany.chapter17.exercise36;

import com.homecompany.chapter17.exercise14.Maps;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SlowMap5<K,V> extends AbstractMap<K,V> {
    private List<Entry<K,V>> storage = new ArrayList<>();
    EntryComp<K,V> comp = new EntryComp<>();
    private static class Entry<K,V> implements Map.Entry<K,V>, Comparable<Entry<K,V>>{
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
        public int compareTo(@NotNull Entry<K,V> entry) {
            return Integer.compare(this.key.hashCode(), entry.key.hashCode());
        }

    }
    @SuppressWarnings("unchecked")
    private static class EntryComp<K,V> implements Comparator<Entry<K,V>>{

        @Override
        public int compare(Entry<K, V> o1, Entry<K, V> o2) {
            Comparable<K> k1 = (Comparable<K>)o1.getKey();
            return k1.compareTo(o2.getKey());
        }
    }
    private void sort () {
        Collections.sort(storage);
    }
    @Override
    public V put(K key, V value) {
        V oldValue = null;
        Entry<K,V> pair = new Entry<>(key, value);
        boolean found = false;
        if (storage.isEmpty())
            storage.add(pair);
        for (Entry<K,V> entry:
                storage) {
            if (entry.getKey().equals(key)) {
                oldValue = entry.getValue();
                entry.setValue(value);
                sort();
                found = true;
                break;
            }
        }
        if(!found){
        storage.add(pair);
        sort();
        }
        return oldValue;
    }

    @SuppressWarnings("unchecked")
    @Override
    public V get(Object key) {
        Entry<K,V> entry = new Entry<>((K)key, null);
        int index = Collections.binarySearch(storage, entry, comp);
        if (index < 0)
            return null;
        return storage.get(index).getValue();
    }
    @SuppressWarnings("unchecked")
    @Override
    public V remove(Object key) {
        V oldValue = null;
        int index = Collections.binarySearch(storage, new Entry<>((K)key, null), comp);
        if (index >= 0) {
            oldValue = storage.get(index).getValue();
            storage.remove(storage.get(index));
        }
        return oldValue;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new TreeSet<>(storage);
    }
    Set<K> keySet;

    @NotNull
    @Override
    public Set<K> keySet() {
        Set<K> ks = keySet;
        if (ks == null) {
            ks = new AbstractSet<K>() {
                @Override
                public Iterator<K> iterator() {
                    return new Iterator<K>() {
                        int index = -1;
                        boolean canRemove = false;
                        @Override
                        public boolean hasNext() {
                            return index < storage.size()-1;
                        }

                        @Override
                        public K next() {
                            canRemove = true;
                            ++index;
                            return storage.get(index).getKey();
                        }

                        @Override
                        public void remove() {
                            if(!canRemove)
                                throw new IllegalStateException();
                            canRemove = false;
                            storage.remove(storage.get(index--));
                        }
                    };
                }

                @Override
                public int size() {
                    return SlowMap5.this.size();
                }
            };
        }
        keySet = ks;
        return keySet;
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
       return storage.isEmpty();
    }

    @Override
    public void clear() {
        storage.clear();
    }

    public static void main(String[] args) {
        SlowMap5<Integer,String> map = new SlowMap5<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "String " + i);
        }
        System.out.println(map);
        System.out.println(map.put(9, "String 10"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(9));
        System.out.println(map.remove(9));
        System.out.println(map);
        map.clear();
        System.out.println(map);
        Maps.testMap(new SlowMap5<>());
    }
}
