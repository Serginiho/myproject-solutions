package com.homecompany.chapter10.exercise14;

class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
