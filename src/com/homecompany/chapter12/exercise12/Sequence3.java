package com.homecompany.chapter12.exercise12;

import com.homecompany.chapter10.exercise2.Selector;
import com.homecompany.chapter10.exercise2.Sequence;

class Sequence3 {
    private Object[] items;
    private int next = 0;
    public Sequence3 (int size){
        items = new Object[size];
    }
    public void add(Object x){
      if (next >= items.length){
          throw new ArrayIndexOutOfBoundsException();
      }else {
        items[next++] = x;}
    }
    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i<items.length) i++;

        }

        @Override
        public Sequence getSequence() {
            return null;
        }
    }
    public Selector selector (){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence3 sq3 = new Sequence3(5);
        for (int i = 0; i < 5; i++) {
            sq3.add(Integer.toString(i));
        }
        Selector selector = sq3.selector();
        while (!selector.end()){
            System.out.print(selector.current() + "; ");
            selector.next();
        }
/*        System.out.println();
        sq3.add(Integer.toString(5));*/
    }
}
