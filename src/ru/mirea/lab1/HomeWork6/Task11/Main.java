package ru.mirea.lab1.HomeWork6.Task11;

public class Main
{
    public static void main(String args[])
    {
        float converted = new Converter().convert(-273);
        System.out.println(String.format("%.2f C",converted));
    }
}
