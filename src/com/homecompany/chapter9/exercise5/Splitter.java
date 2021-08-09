package com.homecompany.chapter9.exercise5;

import java.util.Arrays;

class Splitter extends StringProcessor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
