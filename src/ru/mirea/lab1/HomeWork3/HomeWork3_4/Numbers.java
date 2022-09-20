package ru.mirea.lab1.HomeWork3.HomeWork3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Numbers
{
    static int[] numbers;
    static ArrayList<String> anotherArray;

    public static void Start()
    {
        System.out.print("Введите значения: ");
        CorrectInput();
        GenerateNumbers();
        CreateAnotherArray();

        for(String string : anotherArray)
        {
            System.out.print(string + " ");
        }
    }

    private static void CreateAnotherArray()
    {
        ArrayList<String> stringArray = new ArrayList<String>();
        for (int counter = 0; counter < numbers.length; counter++)
        {
            if(numbers[counter] % 2 == 0 && numbers[counter] != 0)
            {
                stringArray.add(String.valueOf(numbers[counter]));
            }
        }
        anotherArray = stringArray;
    }

    private static void GenerateNumbers()
    {
        Random random = new Random();
        for (int counter = 0; counter < numbers.length; counter++)
        {
            numbers[counter] = random.nextInt(0, numbers.length);
        }
    }

    private static void CorrectInput()
    {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(true)
        {
            input = scanner.nextInt();
            if(input > 0)
                break;
        }

        numbers = new int[input];
    }
}