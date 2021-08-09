package com.homecompany.chapter10.exercise21;

import com.homecompany.chapter10.exercise20.Event;
import com.homecompany.chapter10.exercise20.GreenhouseControls;

public class GreenhouseController2 {
    public static void main(String[] args){
        GreenhouseControls2 gs2 = new GreenhouseControls2();
        Event[] eventList = {
                gs2.new HumidificationOn(200),
                gs2.new HumidificationOff(400)
        };
        gs2.addEvent(gs2.new Restart(800, eventList));
        gs2.addEvent(new GreenhouseControls().new Terminate(1));
        gs2.run();
    }
}
