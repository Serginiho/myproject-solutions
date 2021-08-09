package com.homecompany.chapter15.exercise8;

class StoryCharacters {
    StoryCharacters () {}
    public String toString() {
        return getClass().getSuperclass().getSimpleName() + " " + getClass().getSimpleName();
    }
}
