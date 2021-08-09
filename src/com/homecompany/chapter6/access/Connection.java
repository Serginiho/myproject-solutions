package com.homecompany.chapter6.access;

class Connection {
    private static int count = 0;
    private Connection(){
//        System.out.println("Соединение " + count);
        count++;
    }
 /*   private static Connection c1 = new Connection(1);
    private static Connection c2 = new Connection(2);
    private static Connection c3 = new Connection(3);
    private static Connection c4 = new Connection(4);
    private static Connection[] con = {c1, c2, c3, c4};*/
    static Connection accessConnection () {
        return new Connection();
    }

     static int getCount() {
        return count;
    }
}
