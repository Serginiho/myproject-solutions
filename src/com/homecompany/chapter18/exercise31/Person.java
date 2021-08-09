package com.homecompany.chapter18.exercise31;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String firstName, lastName, country, city, street, houseNumber;
    public Person (String firstName, String lastName, String country, String city, String street, String houseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    public Element getXML () {
        Element person = new Element("person");
        Element fName = new Element("firstName");
        fName.appendChild(firstName);
        Element lName = new Element("lastName");
        lName.appendChild(lastName);
        Element address = new Element("address");
        Element c = new Element("country");
        c.appendChild(country);
        Element ci = new Element("city");
        ci.appendChild(city);
        Element str = new Element("street");
        str.appendChild(street);
        Element hNumber = new Element("houseNumber");
        hNumber.appendChild(houseNumber);
        address.appendChild(c);
        address.appendChild(ci);
        address.appendChild(str);
        address.appendChild(hNumber);
        person.appendChild(fName);
        person.appendChild(lName);
        person.appendChild(address);
        return person;
    }
    public Person (Element person) {
        firstName = person.getFirstChildElement("firstName").getValue();
        lastName = person.getFirstChildElement("lastName").getValue();
        country = person.getFirstChildElement("address").getFirstChildElement("country").getValue();
        city = person.getFirstChildElement("address").getFirstChildElement("city").getValue();
        street = person.getFirstChildElement("address").getFirstChildElement("street").getValue();
        houseNumber = person.getFirstChildElement("address").getFirstChildElement("houseNumber").getValue();
    }
    public static void format (OutputStream os, Document doc) throws IOException {
        Serializer serializer = new Serializer(os, "ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }

    public static void main(String[] args) throws IOException {
        List<Person> people = Arrays.asList(
                new Person("Jhon", "Watson",
                        "Great Britain", "London", "Baker street", "212"),
                new Person("Sherlock", "Holmes",
                        "Great Britain", "London", "Baker street", "212")
        );
        System.out.println(people);
        Element root = new Element("people");
        for (Person p:
             people) {
            root.appendChild(p.getXML());
        }
        Document doc = new Document(root);
        format(System.out, doc);
        format(new BufferedOutputStream(new FileOutputStream("People.xml")), doc);
    }
}
