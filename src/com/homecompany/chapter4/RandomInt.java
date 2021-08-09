package com.homecompany.chapter4;

import java.util.Arrays;
import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] ar = new int[24];
        for (int i = 0; i < ar.length; i++)
            ar[i] = rnd.nextInt(25);
 //            Arrays.sort(ar, 0,24);
        System.out.println("Массив ar: " + Arrays.toString(ar));
        System.out.println("Размер массива ar: " + ar.length);
        for (int i = 0; i < ar.length-1; i++){
            if (ar[i] > ar[i+1])
                System.out.println("Шаг " + (i+1) + ": " + ar[i] + " больше, чем " + ar[i+1]);
            else if(ar[i] < ar[i+1])
                System.out.println("Шаг " + (i+1) + ": " + ar[i] + " меньше, чем " + ar[i+1]);
            else
                System.out.println("Шаг " + (i+1) + ": " + ar[i] + " равно " + ar[i+1]);
        }
            }
    }



