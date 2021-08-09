package com.homecompany.chapter20.exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://127.0.0.1:5432/postgres", "User", "Tester");
         PreparedStatement preparedStatement = conn.prepareStatement(TableCreator.getSql(args[0]))){
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }
        preparedStatement.execute();
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
