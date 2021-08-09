package com.homecompany.chapter13.exercise12;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        Matcher m =
                Pattern.compile("(?m)(\\b[a-z]+\\b)")
                        .matcher(POEM);
        while (m.find()){
            System.out.println(" " + m.group() + " at positions " +
                    m.start() + "-" + (m.end() - 1));
            s.add(m.group());
        }
        System.out.println(s.size());
        System.out.print(s);
    }
}
