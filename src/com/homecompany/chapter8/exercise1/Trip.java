package com.homecompany.chapter8.exercise1;
//упражнения 1 и 5, 18
public class Trip {
    public static void trip (Cycle c){
        c.ride(c);
    }
    public static void main (String[] args){
  /*      Unicycle uc = new Unicycle();
        Bicycle bc = new Bicycle();
        Tricycle tc = new Tricycle();
        trip(uc);
        trip(bc);
        trip(tc);*/
        Cycle[] cycle = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        for (int i = 0; i< cycle.length; i++)
            trip(cycle[i]);
        ((Unicycle)cycle[0]).balance(); //низходящее преобразование
        ((Bicycle)cycle[1]).balance(); // низходящее преобразование
 //       ((Tricycle)cycle[2]).balance(); // такого метода не определено, низходящее преобразование не поможет
    }
}
