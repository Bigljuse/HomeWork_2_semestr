package ru.mirea.lab1.HomeWork3.HomeWork3_3;

import java.util.Random;

public class Tester
{
    public static int[] numbers;

    public static void Start()
    {
        GenerateRandomNumbers();

        for(int counter = 0; counter < numbers.length; counter++ )
        {
            System.out.print(numbers[counter] + " ");
        }

        System.out.println("Является последовательностью? : " + IsSequence());
    }

    private static void GenerateRandomNumbers()
    {
        numbers = new int[4];

        for(int counter = 0; counter < numbers.length; counter++ )
        {
            numbers[counter] = (new Random()).nextInt(10,99);
        }
    }

    private static boolean IsSequence()
    {
        int tempPreviousNumber = numbers[0];
        for(int counter = 1; counter < numbers.length; counter++ )
        {
            if(tempPreviousNumber > numbers[counter])
                return false;
            tempPreviousNumber = numbers[counter];
        }
        return true;
    }
}
