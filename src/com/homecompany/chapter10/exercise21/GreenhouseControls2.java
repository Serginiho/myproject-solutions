package com.homecompany.chapter10.exercise21;

import com.homecompany.chapter10.exercise20.Event;
import com.homecompany.chapter10.exercise20.GreenhouseControls;

public class GreenhouseControls2 extends GreenhouseControls {
    private boolean humidification = false;
    public class HumidificationOn extends Event{
        public HumidificationOn (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            humidification = true;
        }

        @Override
        public String toString() {
            return "Увлажнение включено";
        }
    }
    public class HumidificationOff extends Event{
        public HumidificationOff (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            humidification = false;
        }

        @Override
        public String toString() {
            return "Увлажнение выключено";
        }
    }
}
