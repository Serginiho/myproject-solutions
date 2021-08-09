package com.homecompany.chapter19.exercise1;

import com.homecompany.enumexmpl.Signal;

import static com.homecompany.enumexmpl.Signal.*;

public class TrafficLight {
    Signal color;
    TrafficLight (Signal color) {
        this.color = color;
    }
    public void changeLight () {
        switch (color){
            case RED: color = GREEN;
            break;
            case GREEN: color = YELLOW;
            break;
            case YELLOW: color = RED;
            break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight(RED);
        for (int i = 0; i < 10; i++) {
            System.out.println(t);
            t.changeLight();
        }
    }
}
