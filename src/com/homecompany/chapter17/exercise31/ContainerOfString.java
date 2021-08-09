package com.homecompany.chapter17.exercise31;

import util.Generated;
import util.RandomGenerator;

import java.util.*;

public class ContainerOfString extends AbstractList<String> {
    private String [] strings;
    ContainerOfString () {
        strings = new String[10];
    }

    @Override
    public boolean add(String s) {
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (strings[i] == null) {
                strings[i] = s;
                return true;
            }else if (strings[i] != null)
                count++;
        }
        if (count == size()){
            strings = Arrays.copyOf(strings, size()+1);
            strings[count] = s;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, String element) {
        if (index >= 0 & index < size())
            strings[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        for (String s:
             c) {
            return this.add(s);
        }
        return false;
    }

    @Override
    public String set(int index, String element) {
        String oldValue = null;
        if (index >= 0 & index < size()) {
            oldValue = strings[index];
            strings[index] = element;
        }
        return oldValue;
    }

    @Override
    public String get(int index) {
        if (index < 0 | index > size()-1)
             throw  new IndexOutOfBoundsException();
        return strings[index];
    }
    private class Itr implements Iterator<String>{
        int cursor = 0;
        int lastRet = -1;
        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public String next() {
            try {
                int i = cursor;
                String next = ContainerOfString.this.get(i);
                lastRet = i;
                cursor = i + 1;
                return next;
            } catch (IndexOutOfBoundsException e) {
                throw new NoSuchElementException(e);
            }
        }

        @Override
        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            try {
                ContainerOfString.this.remove(lastRet);
                if (lastRet < cursor)
                    cursor--;
                lastRet = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }
    private class ListItr extends Itr implements ListIterator<String>{
        ListItr (int index) {
            cursor = index;
        }
        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public String previous() {
            try {
                int i = cursor - 1;
                String previous = ContainerOfString.this.get(i);
                lastRet = cursor = i;
                return previous;
            } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e);}
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor-1;
        }

        @Override
        public void set(String s) {
            if (lastRet < 0)
                throw new IllegalStateException();
            try {
                ContainerOfString.this.set(lastRet, s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void add(String s) {
            try {
                int i = cursor;
                ContainerOfString.this.add(i, s);
                lastRet = -1;
                cursor = i + 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public ListIterator<String> listIterator(int index) {
        return new ListItr(index);
    }

    @Override
    public int size() {
        return strings.length;
    }

    @Override
    public String remove(int index) {
        String oldValue = null;
        List<String> newS;
        if (index >=0 & index < size()) {
            oldValue = strings[index];
            newS = new ArrayList<>(Arrays.asList(strings));
            newS.remove(ContainerOfString.this.get(index));
            String[] result = new String[newS.size()];
            strings = Arrays.copyOf(newS.toArray(result), size()-1);
        }
        return oldValue;
    }

    @Override
    public void clear() {
        strings = new String[size()];
    }

    public static void main(String[] args) {
        ContainerOfString cos = new ContainerOfString();
        for (int i = 0; i < 20; i++) {
            cos.add("String " + i);
        }
        System.out.println(cos);
        System.out.println(cos.size());
        System.out.println(cos.add("New String"));
        System.out.println(cos);
        System.out.println(cos.size());
        System.out.println(cos.get(0));
        cos.clear();
        System.out.println(cos);
        System.out.println(cos.size());
        cos.add("String 1");
        System.out.println(cos);
        for (int i = 0; i < 16; i++) {
            cos.remove(5);
            System.out.println(cos.size());
        }
        System.out.println(cos);
        for (int i = 0; i < 50; i++) {
            List<String> list = new ArrayList<>(Arrays.asList(Generated.array(String.class,
                    new RandomGenerator.String(), 1)));
            cos.add(list.get(0));
        }
        System.out.println(cos);
        System.out.println(cos.size());
    }
}
