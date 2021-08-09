package com.homecompany.chapter18.exercise31;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;
import nu.xom.ParsingException;

import java.io.IOException;
import java.util.ArrayList;

public class People extends ArrayList<Person> {
    public People (String fileName) throws ParsingException, IOException {
        Document doc = new Builder().build(fileName);
        Elements elements = doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size(); i++) {
            add(new Person(elements.get(i)));
        }
    }

    public static void main(String[] args) throws ParsingException, IOException {
        People people = new People("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter18/exercise31/People.xml");
        System.out.println(people);
    }
}
