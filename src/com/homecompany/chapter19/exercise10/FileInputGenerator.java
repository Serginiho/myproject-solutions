package com.homecompany.chapter19.exercise10;

import util.Generator;
import util.TextFile;

import java.util.Iterator;

class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;
    public FileInputGenerator (String fileName) {
        input = new TextFile(fileName, ";").iterator();
    }
    @Override
    public Input next() {
        if(!input.hasNext())
            return null;
        return Enum.valueOf(Input.class, input.next().trim());
    }
}
