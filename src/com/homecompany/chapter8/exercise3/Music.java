package com.homecompany.chapter8.exercise3;

import com.homecompany.chapter9.exercise4.Playable;

import java.util.Arrays;

//упражнения 6 - 10,12,15
public class Music {
    public static void tune(Playable i){
        i.play(Note.MIDDLE_C);
        i.play(Note.C_SHARP);
        i.play(Note.B_FLAT);
    }
    public static void tuneAll (Playable[] e){
        for (Playable i: e)
            tune(i);
    }
    private static RandomInstrumentGenerator rig = new RandomInstrumentGenerator();
    public static void main (String[] args) {
        Playable[] i = new Playable[6];
        for (int j = 0; j < i.length; j++) {
            i[j]= rig.next();
        }
        //26 упражнение глава 14
        for(Playable inst: i){
            if (inst instanceof Wind)
                ((Wind) inst).clearSpitValve(inst);
        }
        //
        tuneAll(i);
        System.out.println();
        System.out.println(Arrays.toString(i));
    }
}
