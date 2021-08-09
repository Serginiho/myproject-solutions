package com.homecompany.chapter12.exercise13;

import com.homecompany.chapter12.exercise9.Ex9Exception1;
import com.homecompany.chapter12.exercise9.Ex9Exception2;
import com.homecompany.chapter12.exercise9.Ex9Exception3;

public class Ex13Test {
    static int count = 0;
    static void testExc (int i) throws Ex9Exception1, Ex9Exception2, Ex9Exception3 {
        if (i == 1){
            throw new Ex9Exception1("Ex9Exception1 возбуждено из testExc");
        }else if (i == 2){
            throw new Ex9Exception2("Ex9Exception2 возбуждено из testExc");
        }else if (i == 3){
            throw new Ex9Exception3("Ex9Exception3 возбуждено из testExc");
        }else if (i == 4){
            throw new NullPointerException();
        }else {System.out.println("No Exception in " + i);}
    }
    public static void main (String[] args){
        while (true) {
            try {
                    testExc(count++);
            }catch (Exception e) {
                        System.out.println("Exception caught");
                        e.printStackTrace(System.out);
                    }finally {
                System.out.println("finally block worked");
                if (count == 10) break;
                }
            }
        }
    }

