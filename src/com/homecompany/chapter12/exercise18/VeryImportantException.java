package com.homecompany.chapter12.exercise18;

class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "Важное исключение!";
    }
}
