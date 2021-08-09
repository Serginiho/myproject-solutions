package com.homecompany.chapter17.exercise22;

import com.homecompany.chapter17.exercise15.MapEntry;
import util.Countries;

import java.util.*;

public class SimpleHashMap4<K,V> extends AbstractMap<K,V> {
    // Choose a prime number for the hash table
    // size, to achieve a uniform distribution:
    static final int SIZE = 997;
    // You can't have a physical array of generics,
    // but you can upcast to one:
    @SuppressWarnings("unchecked")
    public LinkedList<MapEntry<K,V>>[] buckets =
            new LinkedList[SIZE];
    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<>();
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<>(key, value);
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
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        for(MapEntry<K,V> iPair : buckets[index])
            if(iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }
    @Override
    public Set<Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set= new HashSet<>();
        for(LinkedList<MapEntry<K,V>> bucket : buckets) {
            if(bucket == null) continue;
            for(MapEntry<K,V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }

    @Override
    public V remove(Object key) {
        V oldValue = null;
        if(get(key)!=null){
            int index = Math.abs(key.hashCode()) % SIZE;
            for(MapEntry<K,V> iPair : buckets[index])
                if(iPair.getKey().equals(key)) {
                    oldValue = iPair.getValue();
                    buckets[index].remove(iPair);
                    return oldValue;
                }
        }

//        LinkedList<MapEntry<K,V>> bucket = buckets[index];
//        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
//        while(it.hasNext()) {
//            MapEntry<K,V> iPair = it.next();
//            if(iPair.getKey().equals(key)) {
//                oldValue = iPair.getValue();
//                it.remove();
//                break;
//            }
//        }
        return oldValue;
    }

    @Override
    public void clear() {
        for (LinkedList<MapEntry<K,V>> bucket:
             buckets) {
            if(bucket!=null){
                bucket.clear();
            }
        }
    }

    public static void main(String[] args) {
        SimpleHashMap4<String, String> shm4 = new SimpleHashMap4<>(),
                shm5 = new SimpleHashMap4<>();
        shm5.putAll(Countries.capitals(20));
        shm4.putAll(Countries.capitals(20));
        System.out.println(shm4.equals(shm5));
        System.out.println(shm4);
        shm4.clear();
        System.out.println(shm4);
        shm4.putAll(Countries.capitals(50));
        System.out.println(shm4.equals(shm5));
        System.out.println(shm4);
        System.out.println(shm4.containsKey("BENIN"));
        shm4.remove("BENIN");
        System.out.println(shm4);
        System.out.println(shm4.containsKey("BENIN"));
        shm4.putAll(Countries.capitals(50));
        System.out.println(shm4);
        Set<String> keys = shm4.keySet();
        System.out.println(keys + ", " + keys.size());
        for (String s:
             keys) {
            shm4.remove(s);
        }
        System.out.println(shm4.isEmpty());
    }
}
