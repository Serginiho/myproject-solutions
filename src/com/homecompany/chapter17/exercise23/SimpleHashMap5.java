package com.homecompany.chapter17.exercise23;

import com.homecompany.chapter17.exercise15.MapEntry;
import com.homecompany.chapter17.exercise22.SimpleHashMap4;
import org.jetbrains.annotations.NotNull;
import util.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SimpleHashMap5<K,V> extends SimpleHashMap4<K,V> {

    @Override
    public int size() {
        int size = 0;
        for (LinkedList<MapEntry<K,V>> bucket:
             buckets) {
            if (bucket!=null)
              size+= bucket.size();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        for (LinkedList<MapEntry<K,V>> bucket: buckets) {
            if (bucket == null) continue;
                for (MapEntry<K,V> pair: bucket)
                    if (pair.getKey().equals(key))
                        return true;
        }
        return false;
    }

    @NotNull
    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (LinkedList<MapEntry<K,V>> bucket: buckets)
            if (bucket != null)
                for (MapEntry<K,V> me:
                     bucket) {
                    values.add(me.getValue());
                }
        return values;
    }

    public static void main(String[] args) {
        SimpleHashMap5<String, String> shm5 = new SimpleHashMap5<>();
        shm5.putAll(Countries.capitals(10));
        System.out.println(shm5);
        System.out.println(shm5.containsKey("ALGERIA"));
        System.out.println(shm5.containsKey("MARS"));
        System.out.println(shm5.size());
        System.out.println(shm5.isEmpty());
        shm5.clear();
        System.out.println(shm5.isEmpty());
        shm5.putAll(Countries.capitals(10));
        SimpleHashMap5<String, String> shm6 = new SimpleHashMap5<>();
        shm6.putAll(Countries.capitals(10));
        System.out.println(shm6);
        System.out.println(shm5.equals(shm6));
        System.out.println(shm5.values().equals(shm6.values()));
        System.out.println(shm5.keySet().equals(shm6.keySet()));
        System.out.println(shm5.equals(shm5));
    }
}
