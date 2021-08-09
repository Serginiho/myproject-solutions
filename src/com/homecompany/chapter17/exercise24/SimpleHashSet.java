package com.homecompany.chapter17.exercise24;

import util.CountingAndSkipGenerator;
import util.Generated;

import java.util.*;

public class SimpleHashSet<V> extends AbstractSet<V> {
    private final static int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<V>[] buckets = new LinkedList[SIZE];

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            int count;
            private boolean canRemove;
            int index1, index2;
            @Override
            public boolean hasNext() {
                return count < size();
            }

            @Override
            public V next() {
                if (hasNext()) {
                    canRemove = true;
                    ++count;
                    for(;;){
                        while (buckets[index1] == null)
                            index1++;
                        try {
                            return buckets[index1].get(index2++);
                        }catch (IndexOutOfBoundsException e){
                            ++index1;
                            index2=0;
                        }
                    }
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                if (canRemove){
                    canRemove = false;
                    buckets[index1].remove(index2--);
                    if(buckets[index1].isEmpty())
                        buckets[index1++] = null;
                    --count;
                }else {
                    throw new IllegalStateException();
                }
            }
        };
    }

    @Override
    public int size() {
        int sz = 0;
        for (LinkedList<V> bucket : buckets)
            if (bucket != null)
                sz += bucket.size();
        return sz;
    }

    @Override
    public boolean add(V value) {
        int index = Math.abs(value.hashCode())%SIZE;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<>();
        LinkedList<V> bucket = buckets[index];
        ListIterator<V> it = bucket.listIterator();
        while (it.hasNext())
            if (it.next().equals(value))
                return false;
        it.add(value);
        return true;
    }

    @Override
    public boolean contains(Object o) {
        int index = Math.abs(o.hashCode()) % SIZE;
        if (buckets[index] == null) return false;
        Iterator<V> it = buckets[index].iterator();
        while (it.hasNext())
            if (it.next().equals(o))
                return true;
        return false;
    }

    public static void main(String[] args) {
        SimpleHashSet<String> shs = new SimpleHashSet<>();
        for (int i = 0; i < 10; i++) {
            shs.add("String " + i);
        }
        System.out.println(shs);
        System.out.println(shs.size());
        shs.addAll(Collections.singletonList("String"));
        System.out.println(shs);
        System.out.println(shs.addAll(Arrays.asList((Generated.array(new String[10], new CountingAndSkipGenerator.String())))));
        System.out.println(shs);
        SimpleHashSet<String> shs2 = new SimpleHashSet<>();
        for (int i = 0; i < 10; i++) {
            shs2.add("String " + i);
        }
        System.out.println(shs2);
        System.out.println(shs.add("String"));
        System.out.println(shs.addAll(shs2));
        System.out.println(shs);
    }
}
