package com.homecompany.chapter2;

/**
 * @author serginiho
 * @version 1.0
 *
 */
public class FirstTask {
    /**
     * {inheritDoc}
     *
     * @see FifthTask
     *
     */
    static int x;
    static char y;
    static boolean z;
    static double c;
    static long l;
    static byte b;

    public static void main (String[] arg){
        SecondTask st = new SecondTask();
        ThirdTask tt = new ThirdTask();
        FourthTask ft = new FourthTask();
        FifthTask ftone = new FifthTask();
        FifthTask fttwo = new FifthTask();
        ftone.m = 10;
        ftone.p = 11;
        ftone.u = 12;
        fttwo.u = 13;
        fttwo.p = 14;
        fttwo.m = 15;
        ft.k = "Hello, world";
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        System.out.println(l);
        System.out.println(b);
        System.out.println(st.s);
        System.out.println("Сегодня: " + tt.day + "." + tt.month + "." + tt.yaer);
        System.out.println(ft.storage(ft.k));
        System.out.println(ftone.i+ "+" + ftone.m + "+" + ftone.p + "+" + ftone.u);
        System.out.println(fttwo.i + "+" + fttwo.m + "+" + fttwo.p + "+" + fttwo.u);

        System.out.println(FifthTask.increment());
        System.out.println(FifthTask.increment());
    }
}
