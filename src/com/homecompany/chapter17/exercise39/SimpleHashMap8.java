package com.homecompany.chapter17.exercise39;

import com.homecompany.chapter17.exercise15.MapEntry;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class SimpleHashMap8<K,V> extends AbstractMap<K,V> {
    static int capacity = 15;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K,V>>[] buckets =
            new LinkedList[capacity];
    private boolean isPrimeNumber (int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
     private void rehashing() {
        MathContext mc = new MathContext(2);
        BigDecimal size = new BigDecimal(this.size());
        BigDecimal cap = new BigDecimal(capacity);
        float loadFactor = size.divide(cap, mc).floatValue();
        int cell = capacity*2;
        if (loadFactor > 0.75f) {
            while (!isPrimeNumber(cell)){
                cell += 1;
            }
            buckets = Arrays.copyOf(buckets, cell);
            capacity = cell;
            System.out.println("Rehashing at load factor = " + loadFactor + ", new capacity is " + capacity);
        }
    }
    @Override
    public V put(K key, V value) {
        rehashing();
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % capacity;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<>();
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()) {
            MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }
        if(!found)
            buckets[index].add(pair);
        return oldValue;
    }
    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % capacity;
        if(buckets[index] == null) return null;
        for(MapEntry<K,V> iPair : buckets[index])
            if(iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }
    @Override
    public Set<Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
        for(LinkedList<MapEntry<K,V>> bucket : buckets) {
            if(bucket == null) continue;
            for(MapEntry<K,V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }

    @Override
    public int size() {
        int sz = 0;
        for (LinkedList<MapEntry<K, V>> me:
             buckets) {
            if (me != null)
                sz+= me.size();
        }
        return sz;
    }
    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        buckets = new LinkedList[capacity];
    }

    public static void main(String[] args) {
        SimpleHashMap8<Integer, Integer> map = new SimpleHashMap8<>();
        for (int i = 0; i < 20; i++) {
            map.put(i, i);
        }
        System.out.println(map);
        System.out.println(map.size());
    }
}
