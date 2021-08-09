package com.homecompany.chapter10.exercise14;

import java.util.Arrays;

class Splitter extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
