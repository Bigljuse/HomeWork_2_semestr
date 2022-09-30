package ru.mirea.lab1.HomeWork6.TaskFrom6To9;

import java.util.Random;

public class Book implements Printable
{

    public void print()
    {
        System.out.print(String.format("Книга: %s", new Random().nextInt(10)));
    }
}
