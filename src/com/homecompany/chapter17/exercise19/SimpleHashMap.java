package com.homecompany.chapter17.exercise19;

import com.homecompany.chapter17.exercise15.MapEntry;
import util.Countries;
import util.TextFile;

import java.util.*;

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
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
        int index = Math.abs(key.hashCode()) % SIZE;
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
    public static SimpleHashMap<String, Integer> countUWords (String fileName, String regex){
        List<String> words = new ArrayList<>(new TextFile(fileName, regex));
        SimpleHashMap<String, Integer> countUniqueWords = new SimpleHashMap<>();
        for (String s:
                words) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).equals(s))
                    count++;
            }
            countUniqueWords.put(s, count);
        }
        return countUniqueWords;
    }
    public static void main(String[] args) {
        SimpleHashMap<String,String> m =
                new SimpleHashMap<>(),
                m2 = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        m2.putAll(Countries.capitals(25));
        System.out.println(m.equals(m2));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
        System.out.println();
        System.out.println("Unique words");
        System.out.println(countUWords(
                "/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter17/exercise17/SlowMap3.java",
                "\\W+"));
    }
}
