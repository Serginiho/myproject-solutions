package com.homecompany.chapter10.exercise15;

// упражнение 19
public class Games {
    public static void playGames(GameFactory gf){
        Game g = gf.getGame();
        g.flip();
    }
    public static void main (String[] args){
        playGames(Coin.factory);
        playGames(Cube.factory);
    }
}
