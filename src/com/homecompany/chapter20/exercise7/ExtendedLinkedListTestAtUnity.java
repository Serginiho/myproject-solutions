package com.homecompany.chapter20.exercise7;

import util.atunit.AtUnit;
import util.atunit.Test;

import java.util.LinkedList;

public class ExtendedLinkedListTestAtUnity extends LinkedList<String> {
    @Test
    boolean testInitialization () {
        return this.isEmpty();
    }
    @Test
    boolean testAdd () {
        this.add("String1");
        return this.contains("String1");
    }
    public static void main(String[] args) throws Exception {
        AtUnit.main(args);
    }
}
