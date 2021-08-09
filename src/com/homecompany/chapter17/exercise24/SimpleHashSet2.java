package com.homecompany.chapter17.exercise24;

import com.homecompany.chapter17.exercise23.SimpleHashMap5;
import org.jetbrains.annotations.NotNull;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

public class SimpleHashSet2 <V> extends AbstractSet<V> {
    private SimpleHashMap5<V,Object> map = new SimpleHashMap5<>();
    private static final Object PRESENT = new Object();
    @Override
    public Iterator<V> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean add(V v) {
        return (map.put(v, PRESENT)==null);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends V> c) {
        boolean addElement = false;
        for (V element : c)
            if (this.add(element))
                addElement = true;
        return addElement;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    public static void main(String[] args) {
        SimpleHashSet2<String> shs = new SimpleHashSet2<>();
        for (int i = 0; i < 10; i++) {
            shs.add("String " + i);
        }
        System.out.println("shs " + shs);
        System.out.println("shs size " + shs.size());
        SimpleHashSet2<String> shs2 = new SimpleHashSet2<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(shs2.add("String " + i));
        }
        System.out.println("shs2 " + shs2);
        System.out.println("shs2 size " + shs2.size());
        System.out.println("add shs2 into shs " + shs.addAll(shs2));
        SimpleHashSet2<String> shs3 = new SimpleHashSet2<>();
        for (int i = 10; i < 20; i++) {
            shs3.add("String " + i);
        }
        System.out.println("shs3 " + shs3);
        System.out.println("shs3 size " + shs3.size());
        System.out.println("add shs3 into shs " +shs.addAll(shs3));
        System.out.println("shs " + shs);
        System.out.println("shs size " + shs.size());
        System.out.println("shs is empty " + shs.isEmpty());
        shs.clear();
        System.out.println("shs is empty after clear " + shs.isEmpty());
    }
}
