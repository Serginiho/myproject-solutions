package com.homecompany.chapter20.exercise1;

import com.organization.annotationprocessor.sql.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
    private static String tableName;
    private static List<String> columnDefs = new ArrayList<>();
    private static String getConstraints (Constraints con) {
        String constraints = "";
        if(!con.allowNull())
            constraints += " NOT NULL";
        if(con.primaryKey())
            constraints += " PRIMARY KEY";
        if(con.unique())
            constraints += " UNIQUE";
        return constraints;
    }
    public static String getSql (String fullQName) throws ClassNotFoundException {
            Class<?> cl = Class.forName(fullQName);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if(dbTable == null) {
                System.out.println("No DBTable annotation in class " + fullQName);
            }
            tableName = dbTable.name();
            if(tableName.length()<1)
                tableName = cl.getName().toUpperCase();
            for (Field field:
                    cl.getDeclaredFields()) {
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if(anns.length < 1)
                    continue;
                if(anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger) anns[0];
                    if(sInt.name().length()<1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sInt.name();
                    columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
                }
                if(anns[0] instanceof SQLString) {
                    SQLString sqlString = (SQLString) anns[0];
                    if(sqlString.name().length()<1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sqlString.name();
                    columnDefs.add(columnName + " VARCHAR(" + sqlString.value() + ")"
                            + getConstraints(sqlString.constraints()));
                }
                if(anns[0] instanceof SQLDouble) {
                    SQLDouble sqlDouble = (SQLDouble) anns[0];
                    if(sqlDouble.name().length()<1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sqlDouble.name();
                    columnDefs.add(columnName + " FLOAT" + getConstraints(sqlDouble.constraints()));
                }
                if(anns[0] instanceof SQLLong) {
                    SQLLong sqlLong = (SQLLong) anns[0];
                    if (sqlLong.name().length()<1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sqlLong.name();
                    columnDefs.add(columnName + " BIGINT" + getConstraints(sqlLong.uniqueness().constraints()));
                }
            }
        StringBuilder createCommand = new StringBuilder(
                "CREATE TABLE " + tableName + "(");
        String tableCreate = "";
        for (String columnDef:
                columnDefs) {
            createCommand.append("\n     ").append(columnDef).append(",");
            tableCreate = createCommand.substring(0, createCommand.length()-1) + ");";
        }
        return tableCreate;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length < 1){
            System.out.println();
            System.exit(0);
        }
        System.out.println(getSql(args[0]));
    }
}
