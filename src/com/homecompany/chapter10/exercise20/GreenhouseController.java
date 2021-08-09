package com.homecompany.chapter10.exercise20;

import com.homecompany.chapter10.exercise21.GreenhouseControls2;

public class GreenhouseController {
    public static void main (String[] args){
        GreenhouseControls gs = new GreenhouseControls();
        GreenhouseControls2 gs2 = new GreenhouseControls2();
        gs.addEvent(gs.new Bell(900));
        Event[] eventList = {
                gs.new ThermostatNight(0),
                gs.new LightOn(200),
                gs.new LightOff(400),
                gs.new WaterOn(600),
                gs.new WaterOff(800),
                gs.new ThermostatDay(1400),
                gs.new AiringOn(1600),
                gs.new AiringOff(1800),
                gs2.new HumidificationOn(2000),
                gs2.new HumidificationOff(2200)
        };
        gs.addEvent(gs.new Restart(2400,eventList));
        if(args.length == 1) {
            gs.addEvent(new GreenhouseControls().new Terminate(Integer.parseInt(args[0])));
        }
//        gs.addEvent(new GreenhouseControls.Terminate(1));
        gs.run();
    }
}
