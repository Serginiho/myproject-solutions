package com.homecompany.chapter7.extend;

public class StaticFinal {
    private final A a;
    private static int i;
    private static final int J_1 = 100;
    A b = new A(12);

    public StaticFinal() {
        a = new A(1);
    }
    public StaticFinal(int q) {
        a = new A(2);
    }
 //   {b = a;}// Не возможно передать ссылку, а не инициализирована.

    public static void main(String[] args){
        StaticFinal sf = new StaticFinal();
        StaticFinal sf2 = new StaticFinal(2);
        for (i=0; i<10; i++)
            System.out.println(i+J_1);
                    System.out.print(J_1);
    }
}
