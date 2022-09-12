package ru.mirea.lab1.HomeWork2.HomeWork2_9;

public class PokerTest
{
    public static void Start(int playersCount)
    {
        Poker poker = new Poker(playersCount);
        poker.StartGame();
    }
}
