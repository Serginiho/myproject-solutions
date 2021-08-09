package com.homecompany.chapter17.exercise21;

import com.homecompany.chapter17.exercise15.MapEntry;
import util.Countries;

import java.util.*;

public class SimpleHashMap3<K,V> extends AbstractMap<K,V> {
    // Choose a prime number for the hash table
    // size, to achieve a uniform distribution:
    static final int SIZE = 997;
    // You can't have a physical array of generics,
    // but you can upcast to one:
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K,V>>[] buckets =
            new LinkedList[SIZE];
    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K,V> pair = new MapEntry<>(key, value);
        int countTry = 0;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<>();
        else {
            System.out.println("Collision while adding\n" + pair
                    +"\nBuckets already contains: ");
            Iterator<MapEntry<K,V>> it = buckets[index].iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                countTry++;
            }
        }
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()) {
            MapEntry<K,V> iPair = it.next();
            countTry++;
            if(iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }

        if(!found) {
            buckets[index].add(pair);
        }
        if (countTry != 0)
            System.out.println("Count try for collision: " + countTry);
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

    public static void main(String[] args) {
        SimpleHashMap3<String, String> shm3 = new SimpleHashMap3<>();
        shm3.putAll(Countries.capitals());
        shm3.putAll(Countries.capitals(50));
        shm3.putAll(Countries.capitals(50));
        System.out.println(shm3);
    }
}
