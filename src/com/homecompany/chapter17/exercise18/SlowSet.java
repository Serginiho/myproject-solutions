package com.homecompany.chapter17.exercise18;

import org.jetbrains.annotations.NotNull;
import util.CountingAndSkipGenerator;
import util.Generated;
import util.RandomGenerator;

import java.util.*;

public class SlowSet<K> extends AbstractSet<K> {
    private List<K> item = new ArrayList<>();
    @Override
    public Iterator<K> iterator() {
        return item.iterator();
//        return new Iterator<K>() {
//            int index = -1;
//            @Override
//            public boolean hasNext() {
//                return index < item.size()-1;
//            }
//            @Override
//            public K next() {
//                int i = ++ index;
//                return item.get(i);
//            }
//
//            @Override
//            public void remove() {
//                item.remove(index--);
//            }
//        };
    }

    @Override
    public int size() {
        return item.size();
    }

    @Override
    public boolean add(K k) {
        if (!item.contains(k)){
            item.add(k);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends K> c) {
        return item.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return item.removeAll(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SlowSet<?> slowSet = (SlowSet<?>) o;
        return item.equals(slowSet.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), item);
    }

    @Override
    public String toString() {
        return item.toString();
    }

    @Override
    public boolean isEmpty() {
        return item.isEmpty();
    }

    public static void main(String[] args) {
        SlowSet<String> ss = new SlowSet<>();
        ss.addAll(Arrays.asList(Generated.array(new String[20], new RandomGenerator.String())));
        System.out.println(ss);
        System.out.println(ss.isEmpty());
        ss.removeAll(ss);
        System.out.println(ss.isEmpty());
        SlowSet<Integer> ss2 = new SlowSet<>();
        for (int i = 0; i < 20; i++) {
            ss2.add(i);
        }
        System.out.println(ss2);
        ss2.add(20);
        System.out.println(ss2);
        ss2.add(5);
        System.out.println(ss2);
        List<Integer> integerList = new ArrayList<>(Arrays.asList(Generated.array(new Integer[5], new CountingAndSkipGenerator.Integer())));
        System.out.println(integerList);
        ss2.removeAll(integerList);
        System.out.println(ss2);
    }
}
