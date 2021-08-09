package com.homecompany.chapter9.exercise9;

public class CubeFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Cube();
    }
}
