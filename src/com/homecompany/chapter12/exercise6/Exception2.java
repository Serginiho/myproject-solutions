package com.homecompany.chapter12.exercise6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Exception2 extends Exception{
    private Logger logger = Logger.getLogger("Exception2");
    Exception2 () {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
