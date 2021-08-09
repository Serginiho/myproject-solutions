package com.homecompany.chapter3;

public class Assignment {
    static void f(Tank levelY){
        levelY.level = 2.3456f;
    }
    public static void main(String[] arg){
        Tank t1 = new Tank();
        t1.level = 1.5678f;
        System.out.println("t1.level = " + t1.level);
        f(t1);
        System.out.println("t1.level = " + t1.level);
/*      Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 1.985E3F;
        t2.level = 2.367E4F + 2.5E2F;
        System.out.println("t1.level = " + t1.level + " t2.level = " + t2.level);
//        t1.level = t2.level;
        System.out.println("t1.level = " + t1.level + " t2.level = " + t2.level);
        t2 = t1;
        t1.level = 2.34567F;
        System.out.println("t1.level = " + t1.level + " t2.level = " + t2.level);
        t2 = t2;
        System.out.println("t1.level = " + t1.level + " t2.level = " + t2.level);*/

    }
}
