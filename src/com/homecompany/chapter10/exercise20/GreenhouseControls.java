package com.homecompany.chapter10.exercise20;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Свет включен";
        }
    }
    public class LightOff extends Event{
        public LightOff (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Свет выключен";
        }
    }
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Полив включен";
        }
    }
    public class WaterOff extends Event{
        public WaterOff (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Полив выключен";
        }
    }
    private String thermostat = "День";
    public class ThermostatNight extends Event{
        public ThermostatNight (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
         thermostat = "Ночь";
        }

        @Override
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "День";
        }

        @Override
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }
    public class Bell extends Event{
        public Bell (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Динь - Дон!";
        }
    }
    private boolean airing = false;
    public class AiringOn extends Event{
        public AiringOn (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            airing = true;
        }

        @Override
        public String toString() {
            return "Проветривание включено";
        }
    }
    public class AiringOff extends Event{
        public AiringOff (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            airing = false;
        }

        @Override
        public String toString() {
            return "Проветривание выключено";
        }
    }
    public class Restart extends Event{
        private Event [] eventList;
        public Restart (long delayTime, Event [] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e: eventList)
                addEvent(e);
        }
        @Override
        public void action() {
            for (Event e: eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Перезапуск системы";
        }
    }
    public class Terminate extends Event{
        public Terminate (long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение";
        }
    }
}
