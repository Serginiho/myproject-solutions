package com.homecompany.chapter17.exercise3;

import util.Countries;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TestSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>(Countries.names());
        Set<String> s2 = new LinkedHashSet<>(Countries.names());
        Set<String> s3 = new TreeSet<>(Countries.names());
        System.out.println("Before addAll:");
        System.out.println("s1 size(" + s1.size()+ "): " + s1);
        System.out.println("s2 size(" + s2.size()+ "): " + s2);
        System.out.println("s3 size(" + s3.size()+ "): " + s3);
        s1.addAll(Countries.names());
        s2.addAll(Countries.names());
        s3.addAll(Countries.names());
        System.out.println("After addAll:");
        System.out.println("s1 size(" + s1.size()+ "): " + s1);
        System.out.println("s2 size(" + s2.size()+ "): " + s2);
        System.out.println("s3 size(" + s3.size()+ "): " + s3);
    }
}
