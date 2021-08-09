package com.homecompany.chapter18.exercise33;

import java.util.Scanner;
import java.util.prefs.Preferences;

class PreferenceBaseDirectory {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userNodeForPackage(PreferenceBaseDirectory.class);
        int baseDirectory = prefs.getInt("Base directory", 0);
        baseDirectory++;
        prefs.putInt("Base directory", baseDirectory);
        System.out.print("Input number:");
        Scanner sc = new Scanner(System.in);
        try {
            baseDirectory = sc.nextInt();
        } catch (Exception e) {
            System.out.println("It must be number");
            System.exit(0);
        }
        prefs.putInt("Base directory", baseDirectory);
        System.out.println("Preference number is "+prefs.get( "Base directory", null));
    }
}
