package com.homecompany.chapter5;


import com.homecompany.chapter6.access.ConnectionManager;

class AppFiveChap {
    public static void main (String... args){
/*        for (String w: args)
            System.out.println(w + " ");
        ClassString cs = new ClassString(7);
        cs.f7();

          Dog d = new Dog();
       d.bark('x');
       d.bark((byte)0);
       d.bark((short)1);
       d.bark(10, "строка");
       d.bark("cтрока", 10);
       d.bark(1.3f);
       d.bark(0.2);
       DefaultClass b = new DefaultClass();
        new ThisClass().f();
        new Constriction("String", 0);
        System.out.println("Inside main()");
        Cups.cup1.f1(99);

        Cups cups1 = new Cups();
        Cups cups2 = new Cups();
        ClassString cs1 = new ClassString("Row 1");
        ClassString cs2 = new ClassString("Row 2");
        ClassString cs3 = new ClassString("Row 3");
        Object[] a = new Object[]{
                    cs1,
                    cs2,
                    cs3};
        System.out.println("[" + a[0] + ", " + a[1] + ", " + a[2] +"]");
        System.out.println(Arrays.toString(a));
        ClassString[] a = new ClassString[]{
                new ClassString("Row 1"),
                new ClassString("Row 2"),
                new ClassString("Row 3"),
        };
        System.out.println(Arrays.toString(a));
        VarArgs.g("This text", "And this text", "And many many more");
        VarArgs.g("Этот текст", "И этот текст", "И еще много много текстов");*/
 /*       for (Valuta v: Valuta.values())
            System.out.println(v + " Порядок включения: " + v.ordinal());
        Money r = new Money(Valuta.RUB);
        Money e = new Money(Valuta.EUR);
        Money u = new Money(Valuta.USD);
        Money j = new Money(Valuta.JPY);
        Money a = new Money(Valuta.AUD);
        Money x = new Money(Valuta.XCD);
        r.describe();
        e.describe();
        u.describe();
        j.describe();
        a.describe();
        x.describe();*/
//        SixthChapterClass scc = new SixthChapterClass();
        /*      Vector v = new Vector();*/
 //       debug("Пример");
//        com.homecompany.sixthchapter.debugoff.ClassDebug.debug();
//        SixthChapterClass scc = new SixthChapterClass();
 //       scc.s;
 //       scc.show();
//        scc.show2();
//        scc.show3();
 //       Widjet wj = new Widjet();
 //       ConnectionManager cm = new ConnectionManager();
        ConnectionManager.getConnection();
        ConnectionManager.currentConnection();
        ConnectionManager.connectionLeft();
        ConnectionManager.getConnection();
        ConnectionManager.currentConnection();
        ConnectionManager.connectionLeft();
        ConnectionManager.getConnection();
        ConnectionManager.currentConnection();
        ConnectionManager.connectionLeft();
        ConnectionManager.getConnection();
//        cm.getConnection(4);
//        cm.getConnection(5);
//        cm.getConnection(10);
//        cm.getConnection(-11);
    }
}
