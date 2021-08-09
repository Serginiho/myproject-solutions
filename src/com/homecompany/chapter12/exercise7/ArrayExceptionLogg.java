package com.homecompany.chapter12.exercise7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class ArrayExceptionLogg {
    private static Logger logger = Logger.getLogger("ArrayExceptionLogg");
    static void logException (Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main (String[] args){
        Integer[] ia = new Integer[3];
        try {
            System.out.println(ia[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            logException(e);
        }
    }
}
