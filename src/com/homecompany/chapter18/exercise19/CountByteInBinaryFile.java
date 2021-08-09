package com.homecompany.chapter18.exercise19;

import util.BinaryFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountByteInBinaryFile {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> byteIntegerMap = new HashMap<>();
        for (Byte b:
                BinaryFile.read("CountCharacterInText.class")) {
            Integer count = byteIntegerMap.get(b);
            byteIntegerMap.put(b, count == null ? 1 : ++count);
        }
        for (Byte b:
                byteIntegerMap.keySet()) {
            System.out.println(b + " = " + byteIntegerMap.get(b));
        }
    }
}
