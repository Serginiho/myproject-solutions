package com.homecompany.chapter15.exercise8;

import org.jetbrains.annotations.NotNull;
import util.Generator;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Random;

class GeneratorStoryCharacters implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private Class<?>[] types = {McClane.class,Gruber.class,Gennero_McClane.class,Karl.class,Powell.class,Robinson.class };
    private Random rand = new Random();
    public GeneratorStoryCharacters () {}
    private int size =0;
    public GeneratorStoryCharacters (int sz) {
        size = sz;
    }
    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[rand.nextInt(types.length)].getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
    class StoryCharactersIterator implements Iterator<StoryCharacters>{
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return GeneratorStoryCharacters.this.next();
        }
    }
    @NotNull
    @Override
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharactersIterator();
    }
    public static void main (String[] args){
        GeneratorStoryCharacters gen = new GeneratorStoryCharacters();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        System.out.println();
        for (StoryCharacters sc : new GeneratorStoryCharacters(5))
            System.out.println(sc);
    }
}
