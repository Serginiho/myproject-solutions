package com.homecompany.chapter11.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//упражнение 2,20, 3 глава (11)
public class Sequence2 {
 //   private Object[] items;
    private List <Object> items;
//    private int next = 0;
    public Sequence2(){
        items = new ArrayList<>();
    }
    public void add(Object x){
//        if (next< items.size())
            items.add(x);
    }
    public void sequence2Iterator (){
        ListIterator<Object> itS2 = items.listIterator();
        while (itS2.hasNext()){
            Object p = itS2.next();
            System.out.println(p);
        }
    }
    public void sequence2IteratorReverse (){
        ListIterator<Object> itS2R = items.listIterator(items.size());
        while (itS2R.hasPrevious()){
            Object previous = itS2R.previous();
            System.out.println(previous);
        }
    }
  /*  private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public Sequence2 getSequence (){
            return Sequence2.this;
        }

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if(i<items.size()) i++;

        }
    }
    private class SequenceReverseSelector implements ReverseSelector {
        private int i = items.size()-1;

        @Override
        public boolean begin() {
            return i == -1;
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void previous() {
            if(i>=0) i--;
        }
    }*/
    private static class ExmplString {
        private String str;
        ExmplString (String s){
            str = s;
        }

        @Override
        public String toString() {
            return str;
        }
    }
  /*  public Selector selector (){
        return new SequenceSelector();
    }
    public ReverseSelector reverseSelector (){
        return new SequenceReverseSelector();
    }*/
    public static void main(String[] args){
        Sequence2 sequence = new Sequence2();
        sequence.add(new ExmplString("Example 1"));
        sequence.add(new ExmplString("Example 2"));
        sequence.add(new ExmplString("Example 3"));
        sequence.add(new ExmplString("Example 4"));
        sequence.add(new ExmplString("Example 5"));
        sequence.add(new ExmplString("Example 6"));
        sequence.add(new ExmplString("Example 7"));
        sequence.add(new ExmplString("Example 8"));
        sequence.add(new ExmplString("Example 9"));
        sequence.add(new ExmplString("Example 10"));
        sequence.sequence2Iterator();
        sequence.sequence2IteratorReverse();

/*        System.out.println("Прямой пересчет:");
        Selector selector = sequence.selector();
 //       selector.getSequence();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
        System.out.println("Обратный пересчет:");
        ReverseSelector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.begin()){
            System.out.println(reverseSelector.current());
            reverseSelector.previous();
        }*/
    }
}
