package com.homecompany.chapter18.exercise11;

import com.homecompany.chapter10.exercise20.Event;
import com.homecompany.chapter10.exercise20.GreenhouseControls;
import com.homecompany.chapter10.exercise21.GreenhouseControls2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class EventsFactory {
    static List<Class<? extends Event>> types = new ArrayList<>();
    static {
        types.add(GreenhouseControls.LightOn.class);
        types.add(GreenhouseControls.LightOff.class);
        types.add(GreenhouseControls.WaterOn.class);
        types.add(GreenhouseControls.WaterOff.class);
        types.add(GreenhouseControls.ThermostatNight.class);
        types.add(GreenhouseControls.ThermostatDay.class);
        types.add(GreenhouseControls.Bell.class);
        types.add(GreenhouseControls.AiringOn.class);
        types.add(GreenhouseControls.AiringOff.class);
        types.add(GreenhouseControls.Restart.class);
        types.add(GreenhouseControls.Terminate.class);
        types.add(GreenhouseControls2.HumidificationOn.class);
        types.add(GreenhouseControls2.HumidificationOff.class);
    }
    public static Event getEvent (String name, long delay) {
        for (Class<? extends Event> type:
             types) {
            GreenhouseControls gs = new GreenhouseControls();
            GreenhouseControls2 gs2 = new GreenhouseControls2();
            if (type.getSimpleName().equals(name)) {
                if (type.getEnclosingClass().getSimpleName().equals(gs.getClass().getSimpleName())) {
                    try {
                        return type.getConstructor(new Class[]{gs.getClass(), long.class}).newInstance(gs, delay);
                    } catch (InstantiationException | SecurityException | NoSuchMethodException | InvocationTargetException | IllegalArgumentException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        return type.getConstructor(new Class[]{gs2.getClass(), long.class}).newInstance(gs2, delay);
                    } catch (InstantiationException | SecurityException | NoSuchMethodException | InvocationTargetException | IllegalArgumentException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }
    public static Event getRestart (long delay, Event[] events) {
        try {
            GreenhouseControls gs = new GreenhouseControls();
//            Object gs = Class.forName("com.homecompany.chapter10.exercise20.GreenhouseControls.class").getConstructor().newInstance();
//            for (Class<?> cls : gs.getClass().getDeclaredClasses())
//                if (cls.getSimpleName().equals("Restart"))
                       return GreenhouseControls.Restart.class.getDeclaredConstructor(new Class[]{gs.getClass(), long.class, Event[].class}).newInstance(gs, delay, events);
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
