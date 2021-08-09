package com.homecompany.chapter9.exercise8;
//упражнение 18
public class Trip {
    public static void rideCycle (CycleFactory cf){
        Cycle c = cf.getCycle();
        c.ride();
    }
    public static void main (String[] args){
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
