package ru.mirea.lab1.HomeWork3.HomeWork3_1;

import java.util.Random;

public class HomeWork3_1
{
    private static float[] numbers;

    public static void Start()
    {
        GenerateVariant1(10);
        System.out.println();
        GenerateVariant2(10);
    }

    private static void GenerateVariant1(int count)
    {
        numbers = new float[count];
        for(int counter = 0; counter < count; counter++)
        {
            Random random = new Random();
            numbers[counter] = random.nextFloat();
            System.out.print(numbers[counter] +  " ");
        }
    }

    private static void GenerateVariant2(int count)
    {
        numbers = new float[count];
        for(int counter = 0; counter < count; counter++)
        {
            numbers[counter] = (float) Math.random();
            System.out.print(numbers[counter] +  " ");
        }
    }
}
