package com.homecompany.chapter10.exercise14;

class Upcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
