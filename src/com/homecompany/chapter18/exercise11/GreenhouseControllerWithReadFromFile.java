package com.homecompany.chapter18.exercise11;

import com.homecompany.chapter10.exercise20.Event;
import com.homecompany.chapter10.exercise20.GreenhouseControls;
import com.homecompany.chapter18.exercise5.ProcessFilesWithRegex;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class GreenhouseControllerWithReadFromFile {
    private static File getFile (String fileName, String[] dir) {
        final File[] f = {null};
        Pattern p = Pattern.compile("\\w*\\.\\w+");
        if (p.matcher(fileName).matches()) {
            new ProcessFilesWithRegex(new ProcessFilesWithRegex.Strategy() {
                @Override
                public void process(File file) {
                        f[0] = file;
                }
            }, fileName).start(dir);
            return f[0];
        }
        System.out.println("input file name for search");
        return f[0];
    }
    public static Event[] readEventsFromFile (String fileName, String[] dir) throws IOException {
        File file = getFile(fileName, dir);
        if (file != null){
        BufferedReader in = new BufferedReader(new FileReader(file));
        String s;
        String[] valueFoInit;
        Map<String, Long> mapOfValueForInit = new LinkedHashMap<>();
        while ((s=in.readLine()) != null){
            valueFoInit = s.split("\\s+:\\s+");
            mapOfValueForInit.put(valueFoInit[0], Long.parseLong(valueFoInit[1]));
        }
        in.close();
            LinkedList<Event> eventList = new LinkedList<>();
            for (Map.Entry<String, Long> me:
                    mapOfValueForInit.entrySet()) {
                if (!me.getKey().equals("Restart") & !me.getKey().equals("Terminate"))
                    eventList.add(EventsFactory.getEvent(me.getKey(), me.getValue()));
            }
            Event [] events = new Event[eventList.size()];
            eventList.toArray(events);
            if (mapOfValueForInit.containsKey("Restart")){
                eventList.addLast(EventsFactory.getRestart(mapOfValueForInit.get("Restart"), events));
                events = eventList.toArray(events);
            }
            if (mapOfValueForInit.containsKey("Terminate")){
                eventList.addLast(EventsFactory.getEvent("Terminate", mapOfValueForInit.get("Terminate")));
                events = eventList.toArray(events);
            }
            return events;
        }
        System.out.println("File " + fileName + " does not exist");
        return new Event[1];
    }

    public static void main(String[] args) throws IOException {
        GreenhouseControls gs = new GreenhouseControls();
        Event [] events = readEventsFromFile("GreenHouseControlValues.txt", args);
        for (Event e:
             events) {
            if (e != null)
               gs.addEvent(e);
        }
        gs.run();
    }
}
