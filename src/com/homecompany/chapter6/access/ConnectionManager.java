package com.homecompany.chapter6.access;

public class ConnectionManager {
    static int connection =3;
    static Connection[] con = new Connection[4];
   /* static {for (Connection x: con)
        x = Connection.accessConnection();}*/

    public static Connection getConnection (){
       if (connection >0){
           con[connection] = Connection.accessConnection();
           --connection;
           return con[connection];}
       else {System.out.println("Соединения закончились");}
        return null;
    }
    public static void currentConnection(){
        System.out.println("Выделено соединение: " + Connection.getCount());
    }
    public static void connectionLeft (){
         System.out.println("Осталось " + connection + " соединения");
    }
}
