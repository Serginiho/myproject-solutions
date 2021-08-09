package com.homecompany.chapter3;

import java.util.Random;

public class Velocity {
    public static void main(String[] arg){
        int distance, time, speed;
        Random rnd = new Random();
        distance = rnd.nextInt(6400) + 1;
        time = rnd.nextInt(60) + 1;
        speed = distance/time;
        System.out.println("Distance: " + distance + " km");
        System.out.println("Time: " + time + " h");
        System.out.println("Speed: " + speed + " km/h");
    }
}
