package com.homecompany.chapter17.exercise2;

import util.Countries;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CountriesBeginWord {
    public static void main(String[] args) {
        Map<String,String> allCountries = new HashMap<>(Countries.capitals());
        System.out.println("All countries in Map: " + allCountries);
        Map<String,String> countriesBeginA = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("^A\\w+");
        for (Map.Entry<String, String> entry:
                allCountries.entrySet()) {
            Matcher matcher = pattern.matcher(entry.getKey());
            while (matcher.find())
                countriesBeginA.put(entry.getKey(), entry.getValue());
        }
        System.out.println("All countries names in Map begin with A: " + countriesBeginA);
        Set<String> allContNames = new HashSet<>(Countries.names());
        Set<String> countriesBeginAInSet = new LinkedHashSet<>();
        System.out.println("All countries in Set: " + allContNames);
        for (String countryName:
             allContNames) {
            Matcher matcher = pattern.matcher(countryName);
            while (matcher.find())
                countriesBeginAInSet.add(countryName);
        }
        System.out.println("All countries names in Set begin with A: " + countriesBeginAInSet);
    }
}
