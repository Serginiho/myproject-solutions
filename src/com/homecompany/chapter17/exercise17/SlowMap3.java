package com.homecompany.chapter17.exercise17;

import com.homecompany.chapter17.exercise14.Maps;
import com.homecompany.chapter17.exercise15.MapEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class SlowMap3<K,V> implements Map<K,V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    private final class EntrySet extends AbstractSet<Map.Entry<K,V>>{
        @Override
        public @NotNull Iterator<Entry<K, V>> iterator() {
            return new Iterator<Entry<K, V>>() {
                int index = -1;
                @Override
                public boolean hasNext() {
                    return index < keys.size()-1;
                }

                @Override
                public Entry<K, V> next() {
                    int i = ++index;
                    return new MapEntry<>(keys.get(i), values.get(i));
                }

                @Override
                public void remove() {
                    keys.remove(index);
                    values.remove(index--);
                }
            };
        }

        @Override
        public int size() {
            return keys.size();
        }
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean isEmpty() {
        return this.entrySet().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        if (keys.contains(key))
            return true;
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        if (values.contains(value))
            return true;
        return false;
    }

    @Override
    public V get(Object key) {
        V value = null;
        if (keys.contains(key))
            value = values.get(keys.indexOf(key));
        return value;
    }

    @Nullable
    @Override
    public V put(K key, V value) {
        V oldvalue = get(key);
        if(!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        }else
            values.set(keys.indexOf(key), value);
        return oldvalue;
    }

    @Override
    public V remove(Object key) {
        V oldValue = get(key);
        int i = keys.indexOf(key);
        if (keys.contains(key)) {
            values.remove(i);
            keys.remove(i);
        }
        return oldValue;
    }

    @Override
    public void putAll(@NotNull Map<? extends K, ? extends V> m) {
        for (Entry<? extends K, ? extends V> me:
             m.entrySet()) {
            put(me.getKey(),me.getValue());
        }
    }

    @Override
    public void clear() {
        keys.clear();
        values.clear();
    }
    Set<K> keySet;
    @NotNull
    @Override
    public Set<K> keySet() {
        Set<K> ks = keySet;
        if (ks == null)
            ks = new AbstractSet<K>() {
                @Override
                public Iterator<K> iterator() {
                    return new Iterator<K>() {
                        int index = -1;
                        @Override
                        public boolean hasNext() {
                            return index < keys.size()-1;
                        }
                        @Override
                        public K next() {
                            int i = ++index;
                            return keys.get(i);
                        }

                        @Override
                        public void remove() {
                            keys.remove(index);
                            values.remove(index--);
                        }
                    };
                }

                @Override
                public int size() {
                    return keys.size();
                }
            };
        keySet = ks;
        return ks;
    }

    @NotNull
    @Override
    public Collection<V> values() {
        return values;
    }

    @NotNull
    @Override
    public Set<Entry<K, V>> entrySet() {
        return new EntrySet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlowMap3<?, ?> slowMap3 = (SlowMap3<?, ?>) o;
        return keys.equals(slowMap3.keys) && values.equals(slowMap3.values) && keySet.equals(slowMap3.keySet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys, values, keySet);
    }

    @Override
    public String toString() {
        return entrySet().toString();
    }

    public static void main(String[] args) {
        Maps.testMap(new SlowMap3<>());
    }
}
