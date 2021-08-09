package com.homecompany.chapter17.exercise32;

import java.util.*;

public class ContainerOfInteger extends AbstractList<Integer> {
    private Integer [] integers;
    ContainerOfInteger () {
        integers = new Integer[10];
    }

    @Override
    public boolean add(Integer j) {
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (integers[i] == null) {
                integers[i] = j;
                return true;
            }else if (integers[i] != null)
                count++;
        }
        if (count == size()){
            integers = Arrays.copyOf(integers, size()+1);
            integers[count] = j;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, Integer element) {
        if (index >= 0 & index < size())
            integers[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer i:
                c) {
            return this.add(i);
        }
        return false;
    }

    @Override
    public Integer set(int index, Integer element) {
        int oldValue = 0;
        if (index >= 0 & index < size()) {
            if (integers[index] != null){
            oldValue = integers[index];
            }
            integers[index] = element;
        }
        return oldValue;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 | index > size()-1)
            throw  new IndexOutOfBoundsException();
        return integers[index];
    }
    private class Itr implements Iterator<Integer> {
        int cursor = 0;
        int lastRet = -1;
        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public Integer next() {
            try {
                int i = cursor;
                int next = ContainerOfInteger.this.get(i);
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
                ContainerOfInteger.this.remove(lastRet);
                if (lastRet < cursor)
                    cursor--;
                lastRet = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Itr();
    }
    private class ListItr extends Itr implements ListIterator<Integer>{
        ListItr (int index) {
            cursor = index;
        }
        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public Integer previous() {
            try {
                int i = cursor - 1;
                int previous = ContainerOfInteger.this.get(i);
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
        public void set(Integer s) {
            if (lastRet < 0)
                throw new IllegalStateException();
            try {
                ContainerOfInteger.this.set(lastRet, s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void add(Integer s) {
            try {
                int i = cursor;
                ContainerOfInteger.this.add(i, s);
                lastRet = -1;
                cursor = i + 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public ListIterator<Integer> listIterator(int index) {
        return new ListItr(index);
    }

    @Override
    public int size() {
        return integers.length;
    }

    @Override
    public Integer remove(int index) {
        int oldValue = 0;
        List<Integer> newS;
        if (index >=0 & index < size()) {
            if (integers[index] !=null)
                oldValue = integers[index];
            newS = new ArrayList<>(Arrays.asList(integers));
            newS.remove(ContainerOfInteger.this.get(index));
            Integer[] result = new Integer[newS.size()];
            integers = Arrays.copyOf(newS.toArray(result), size()-1);
        }
        return oldValue;
    }

    @Override
    public void clear() {
        integers = new Integer[size()];
    }
}
