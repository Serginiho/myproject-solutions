package com.homecompany.chapter17.exercise20;

import com.homecompany.chapter17.exercise15.MapEntry;
import util.Countries;

import java.util.*;

public class SimpleHashMap2<K,V> extends AbstractMap<K,V> {
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
        if(buckets[index] == null)
            buckets[index] = new LinkedList<>();
        else {
            System.out.println("Collision while adding\n" + pair
            +"\nbuckets already contains: ");
            Iterator<MapEntry<K,V>> it = buckets[index].iterator();
            while (it.hasNext())
                System.out.println(it.next());
        }
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
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
        if(!found) {
            buckets[index].add(pair);
        }
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

//    @Override
//    public void putAll(Map<? extends K, ? extends V> m) {
//        for (Map.Entry<? extends K, ? extends V> me:
//             m.entrySet()) {
//            this.put(me.getKey(),me.getValue());
//        }
//    }

    public static void main(String[] args) {
        SimpleHashMap2<String, String> shm = new SimpleHashMap2<>();
            shm.putAll(Countries.capitals(20));
            shm.putAll(Countries.capitals(20));
            System.out.println(shm);
    }
}
