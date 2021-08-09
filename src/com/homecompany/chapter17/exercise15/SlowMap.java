package com.homecompany.chapter17.exercise15;

import util.TextFile;

import java.util.*;

public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();
    @Override
    public V put(K key, V value) {
        V oldValue = get(key); // The old value or null
        if(!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else
            values.set(keys.indexOf(key), value);
        return oldValue;
    }
    @Override
    public V get(Object key) { // key is type Object, not K
        if(!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }
    @Override
    public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set= new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext())
            set.add(new MapEntry<>(ki.next(), vi.next()));
        return set;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter17/exercise14/Maps.java", "\\W+"));
        System.out.println(words);
        Set<String> uniqWords = new TreeSet<>(words);
        System.out.println(uniqWords);
        SlowMap<String, Integer> countUniqWords = new SlowMap<>();
       for (String s:
             uniqWords) {
            int count = 0;
            for (String t:
                 words) {
                if (s.equals(t))
                    count++;
            }
            countUniqWords.put(s, count);
        }
        System.out.println(countUniqWords);
       SlowMap<String, Integer> countUniqWords2 = new SlowMap<>();
        for (String s:
             words) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).equals(s))
                    count++;
            }
            countUniqWords2.put(s, count);
        }
        System.out.println(countUniqWords2);
    }
}
