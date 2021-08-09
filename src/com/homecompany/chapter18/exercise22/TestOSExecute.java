package com.homecompany.chapter18.exercise22;

import java.util.List;

public class TestOSExecute {
    public static void main(String[] args) {
        List<String> result = OSExecute.executeCommand("javap TestOSExecute");
        int line = 1;
        for (String s:
             result) {
            System.out.println(line++ + ": " + s);
        }
    }
}
