package com.homecompany.chapter17.exercise10;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MySortedSet<T> extends LinkedList<T> {
    public MySortedSet () {}
    public MySortedSet (Collection<? extends T> c){
        for (T t:
             c) {
            addItem(t);
        }
    }
   public boolean addItem(T t) {
        if (!this.contains(t)){
            Iterator<T> it = this.iterator();
            int index = 0;
            while (it.hasNext())
                if (compareTo(it.next(), t) < 1)
                    index++;
                add(index, t);
            return true;
        }
        return false;
   }

    @Nullable
    public Comparator<? super T> comparator() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    @NotNull
    public LinkedList<T> subSet(T fromElement, T toElement) {
        if (!this.contains(fromElement))
            throw new IllegalArgumentException("fromElement out of range");
        if(!this.contains(toElement))
            throw new IllegalArgumentException("toElement out of range");
        int fromIndex = this.indexOf(fromElement);
        int toIndex = this.indexOf(toElement);
        if(fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex more then toIndex");
        return new LinkedList<>(this.subList(fromIndex, toIndex));
    }

    @NotNull
    public LinkedList<T> headSet(T toElement) {
        if (!this.contains(toElement))
            throw new IllegalArgumentException("No such element " + toElement.toString());
        int toIndex = this.indexOf(toElement);
        return new LinkedList<>(this.subList(0,toIndex));
    }

    @NotNull
    public LinkedList<T> tailSet(T fromElement) {
        if (!this.contains(fromElement))
            throw new IllegalArgumentException(" No such element " + fromElement.toString());
        int fromIndex = this.indexOf(fromElement);
        return new LinkedList<>(this.subList(fromIndex, this.size()));
    }

    public T first() {
        if (this.isEmpty())
            throw new NoSuchElementException();
        return this.get(0);
    }

    public T last() {
        if (this.isEmpty())
            throw new NoSuchElementException();
        return this.get(this.size()-1);
    }
    private int compareTo (T t1, T t2) {
        int c = t1.hashCode() - t2.hashCode();
        return Integer.compare(c, 0);
    }
}
