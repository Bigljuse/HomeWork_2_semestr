package ru.mirea.lab1.HomeWork6.TaskFrom6To9;

import java.util.Random;

public class Shop implements Printable
{
    public void print()
    {
        System.out.print(String.format("Журнал под номером: %s\n",  new Random().nextInt(10)));
    }
}