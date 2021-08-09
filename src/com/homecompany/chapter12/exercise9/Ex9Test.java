package com.homecompany.chapter12.exercise9;

class Ex9Test {
    static void testExc (int i) throws Ex9Exception1, Ex9Exception2, Ex9Exception3{
            if (i == 1){
                throw new Ex9Exception1("Ex9Exception1 возбуждено из testExc");
            }else if (i == 2){
                throw new Ex9Exception2("Ex9Exception2 возбуждено из testExc");
            }else if (i == 3){
                throw new Ex9Exception3("Ex9Exception3 возбуждено из testExc");
            } else {System.out.println("No Exception in " + i);}
    }
    public static void main (String[] args){
        boolean f = true;
        while (f) {
            for (int i = 0; i < 6; i++) {
                if (i == 4){
                    f = false;
                } else {
                    try {
                        testExc(i);
                    } catch (Exception e) {
                        System.err.println("Exception caught");
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
