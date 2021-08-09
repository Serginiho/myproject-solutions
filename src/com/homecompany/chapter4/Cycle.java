package com.homecompany.chapter4;

public class Cycle {
    public static void main (String[] args){
        for (int i = 1; i<=100; i++){
 //           if (i == 99) break;
            if (i == 99) return;
            System.out.println(i);}
    }
}
