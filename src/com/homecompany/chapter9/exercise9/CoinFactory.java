package com.homecompany.chapter9.exercise9;

public class CoinFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Coin();
    }
}
