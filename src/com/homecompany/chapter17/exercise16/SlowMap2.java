package com.homecompany.chapter17.exercise16;

import com.homecompany.chapter17.exercise15.MapEntry;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SlowMap2<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();
    Set<Map.Entry<K,V>> entries = new EntrySet();
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


    final class EntrySet extends AbstractSet<Map.Entry<K,V>> {
        private class Iter implements Iterator<Map.Entry<K,V>> {
            private int index = -1;
            @Override
            public boolean hasNext() {
                return index < keys.size()-1;
            }

            @Override
            public Map.Entry<K, V> next() {
                int i = ++index;
                return new MapEntry<K,V>(
                        keys.get(i), values.get(i));
            }
            @Override
            public void remove() {
                keys.remove(index);
                values.remove(index--);
            }
        }

        @Override
        public @NotNull Iterator<Map.Entry<K, V>> iterator() {
            return new Iter();
        }

        @Override
        public int size() {
            return keys.size();
        }
    }
    @Override
    public Set<Map.Entry<K,V>> entrySet() {
    /*    Set<Map.Entry<K,V>> set= new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext())
            set.add(new MapEntry<K,V>(ki.next(), vi.next()));*/
        return entries;
    }

//    @Override
//    public boolean isEmpty() {
//        return keys.isEmpty() && values.isEmpty();
//    }

//    @Override
//    public void clear() {
//        if (!keys.isEmpty() && !values.isEmpty()){
//            keys.clear();
//            values.clear();
//        }
//    }

//    @Override
//    public V remove(Object key) {
//        V oldValue = get(key);
//        if (keys.contains(key)) {
//            values.remove(keys.indexOf(key));
//            keys.remove(key);
//        }
//        return oldValue;
//    }

}
