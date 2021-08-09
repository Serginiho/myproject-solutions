package com.homecompany.chapter13.exercise5;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

class Conversion {
    public static void main(String[] args){
        Formatter f = new Formatter(System.out);
        char u = 'a';
        int v = 1245;
        BigInteger w = new BigInteger("50000000000");
        double x = 129.395;
        boolean z = false;
        Calendar d = new GregorianCalendar();
        f.format("%1$s %1$b %1$B %1$c %1$C %1$h\n", u);
        f.format("%1$-10s %1$,(+010d %1$#x %1$B %1$c %1$h\n", v);
        f.format("%1$-10s %1$,+d %1$b %1$x %1$h\n", w);
        f.format("%1$-10s %1$+010E %1$.10f %1$B %1$h\n", x);
        f.format("%1$-10s %1$B %1$h\n", z);
        f.format("%1$Tc\n", d);
//        %1$te %1$tb %1$tY %1$tj
    }
}
