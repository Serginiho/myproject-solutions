package com.homecompany.chapter9.exercise9;
// упражнение 19
public class Games {
    public static void playGames(GameFactory gf){
        Game g = gf.getGame();
        g.flip();
    }
    public static void main (String[] args){
        playGames(new CoinFactory());
        playGames(new CubeFactory());
    }
}
