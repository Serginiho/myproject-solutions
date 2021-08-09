package com.homecompany.chapter10.exercise20;

import java.util.LinkedList;
import java.util.ListIterator;

public class Controller {
//    private List<Event> eventList = new ArrayList<Event>();
    private LinkedList<Event> eventList = new LinkedList<>();
    public void addEvent (Event c){
//        eventList.add(c);
        eventList.addLast(c);
    }
    public void run(){
        ListIterator<Event> eventListIterator = new LinkedList<>(eventList).listIterator();
        while (eventListIterator.hasNext()){
            Event e = eventListIterator.next();
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventListIterator.remove();
                }
        }
  /*      while (eventList.size()>0)
            for (Event e:
                 new ArrayList<Event>(eventList))
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }*/
    }
}
