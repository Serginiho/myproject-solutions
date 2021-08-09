package com.homecompany.chapter17.exercise8;

import java.util.NoSuchElementException;

public class SList<T> {
    Node<T> headLink = new Node<>(null, null) ;
    public SListIterator<T> iterator () {
        return new SListIterator<>(headLink);
    }
    private static class Node<T> {
        T item;
        Node<T> next;
        Node (T item, Node<T> next){
            this.item = item;
            this.next = next;
        }
        @Override
        public String toString() {
            if (item == null) return "null";
            return item.toString();
        }
    }
    static class SListIterator<T> {
        private Node<T> current;
        SListIterator (Node<T> link){
            current = link;
        }
        public boolean hasNext () {return current.next!= null;}
        public Node<T> next() {
            if (!hasNext())
                throw new NoSuchElementException();
            current = current.next;
            return current;
        }
        public void set (T e) {
//            if (lastReturned == null)
//                throw new IllegalStateException();
            current.next = new Node<>(e, current.next);
            current = current.next;
        }
        public void remove () {
            if (current != null)
            current.next = current.next.next;
        }
    }

    @Override
    public String toString() {
        if (headLink.next == null) return "SList: []";
        SListIterator<T> it = this.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("SList: [");
        while (it.hasNext())
            sb.append(it.next()).append(", ");
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SListIterator<String> it = sList.iterator();
        it.set("String1");
        System.out.println(sList);
        it.set("String2");
        for (int i = 3; i < 10; i++) {
            it.set("String" + i);
        }
        System.out.println(sList);
//        SListIterator<String> it2 = sList.iterator();
//        while (it2.hasNext()){
//        it2.remove();
//        }
//        System.out.println(sList);
    }
}
