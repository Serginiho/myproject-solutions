package com.homecompany.chapter18.exercise22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class OSExecute {
    public static List<String> executeCommand (String command) {
 //       boolean err = false;
        List<String> out = new LinkedList<>();
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader result = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String s;
            while ((s= result.readLine())!=null)
                out.add(s);
            BufferedReader errors = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));
            while ((s= errors.readLine()) != null){
                out.add(s);
 //               err = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        if (err)
//            throw new OSExecuteException("Error executing " + command);
        return out;
    }
}
