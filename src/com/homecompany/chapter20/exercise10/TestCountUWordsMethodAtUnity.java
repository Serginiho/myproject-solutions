package com.homecompany.chapter20.exercise10;

import com.homecompany.chapter17.exercise19.SimpleHashMap;
import util.atunit.AtUnit;
import util.atunit.Test;

public class TestCountUWordsMethodAtUnity {
    @Test
    boolean _methodCountUWords () {
        SimpleHashMap<String, Integer> testMap = SimpleHashMap.countUWords(
                "/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter20/exercise10/WordsForTest",
                "\\W+");
        return testMap.get("word1") == 2 & testMap.get("word2") == 2 & testMap.get("word3") == 1 & testMap.get("word4") == 1;
    }

    public static void main(String[] args) {
        try {
            AtUnit.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
