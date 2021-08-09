package com.homecompany.chapter20.exercise1;
// recompile this file with IDE to receive output txt file at exercise 3

import com.organization.annotationprocessor.sql.*;

@DBTable(name = "TableOfPerson")
public class TableOfPerson {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger
    Integer age;
    @SQLDouble
    Double height;
    @SQLDouble
    Double weight;
    @SQLLong(name = "", uniqueness = @Uniqueness)
    Long personID;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;
    static int personCount;

    public TableOfPerson(String firstName, String lastName, Integer age, Double height, Double weight, Long personID, String handle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.personID = personID;
        this.handle = handle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Long getPersonID() {
        return personID;
    }

    @Override
    public String toString() {
        return handle;
    }
    public static void main(String[] args) {
        TableOfPerson table = new TableOfPerson("Serg",
                "Sh",
                35,
                170.0,
                72.3,
                777770000L,
                "man");

        System.out.println(table.getFirstName());
        System.out.println(table.getLastName());
        System.out.println(table.getAge());
        System.out.println(table.getHeight());
        System.out.println(table.getWeight());
        System.out.println(table.getPersonID());
        System.out.println(table);
    }
}
