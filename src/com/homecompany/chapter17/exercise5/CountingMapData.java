package com.homecompany.chapter17.exercise5;

import java.util.*;

public class CountingMapData extends AbstractMap<Integer, String> {
    private int size;
    private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
    public CountingMapData (int size){
        if (size < 0) this.size = 0;
        this.size = size;
    }
    private static class Entry implements Map.Entry<Integer, String>{
        int index;
        Entry (int index) {
            this.index = index;
        }

        @Override
        public Integer getKey() {
            return index;
        }

        @Override
        public String getValue() {
            return
                    chars[index % chars.length] + (index / chars.length);
        }
        @Override
        public String setValue(String value) {
            throw  new UnsupportedOperationException();
        }
    }
    static class EntrySet extends AbstractSet<Map.Entry<Integer, String>>{
        private int size;
        EntrySet (int size) {
            this.size = size;
        }
        private class Iter implements java.util.Iterator<Map.Entry<Integer, String>>{
            private Entry entry = new Entry(-1);
            @Override
            public boolean hasNext() {
                return entry.index < size-1;
            }

            @Override
            public Map.Entry<Integer, String> next() {
                entry.index++;
                return entry;
            }
        }
        @Override
        public Iterator<Map.Entry<Integer, String>> iterator() {
            return new Iter();
        }

        @Override
        public int size() {
            return size;
        }
    }
    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        return new EntrySet(size);
    }

    public static void main(String[] args) {
        System.out.println(new CountingMapData(60));
    }
}
