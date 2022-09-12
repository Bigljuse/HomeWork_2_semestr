package ru.mirea.lab1.HomeWork1;

import java.util.Scanner;

public class HomeWork1_4
{
    public static void Start()
    {
        int[] newArray = InsertNumbers();
        int maxNumber = GetMaxInt(newArray);
        int minNumber = GetMinInt(newArray, maxNumber);

        System.out.println("Максимальный элемент: "+ maxNumber);
        System.out.println("Минимальный элемент: "+ minNumber);
    }

    private static int[] CreateArray()
    {
        int[] mas = new int[5];

        for(int number = 0; number <= mas.length - 1; number++)
        {
            mas[number] = number + 1;
        }
        return mas;
    }

    private static int[] InsertNumbers()
    {
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int[] array = new int[scanner.nextInt()];

        do
        {
            System.out.print("Введите, чему равен: " + (counter + 1) +" элемент массива: ");
            array[counter] = scanner.nextInt();
            counter++;

        }while(counter < array.length);

        return array;
    }

    private static int GetMaxInt(int[] array)
    {
        int maxInt = 0;

        int counter = 0;
        do
        {
            if(array[counter] > maxInt)
                maxInt = array[counter];

            counter++;

        }while(counter < array.length);

        return maxInt;
    }

    private static int GetMinInt(int[] array, int maxNumber)
    {
        int minInt = maxNumber;

        int counter = 0;
        do
        {
            if(array[counter] < minInt)
                minInt = array[counter];

            counter++;

        }while(counter < array.length);

        return minInt;
    }
}
