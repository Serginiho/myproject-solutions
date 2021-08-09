package com.homecompany.chapter19.exercise11;

import util.Generator;
import util.TextFile;

import java.util.Iterator;

class FileInputGenerator2 implements Generator<ExtendedInput> {
    private Iterator<String> input;
    public FileInputGenerator2 (String fileName) {
        input = new TextFile(fileName, ";").iterator();
    }
    @Override
    public ExtendedInput next() {
        if(!input.hasNext())
            return null;
        String s = input.next().trim();
        try {
            return new ExtendedInput(null, Enum.valueOf(Input2.class,s));
        } catch (Exception e) {
            ItemToSell item = ItemToSell.findItem(s);
            if (item != null)
              return new ExtendedInput(item, Input2.ITEM);
            throw e;
        }
    }
}
