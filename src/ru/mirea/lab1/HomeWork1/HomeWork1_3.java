package ru.mirea.lab1.HomeWork1;

public class HomeWork1_3
{
    public static void Start()
    {
        int[] newArray = CreateArray();
        int numberSum = GetNumbersSum(newArray);
        int arithmeticMean = GetArithmeticMean(newArray);

        System.out.println("Сумма элементов: "+ numberSum);
        System.out.println("Средняя арифметическая сумма: "+ arithmeticMean);
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

    private static int GetNumbersSum(int[] array)
    {
        int count = 0;

        for(int number : array)
        {
            count+= number;
        }

        return count;
    }

    public static int GetArithmeticMean(int[] array)
    {
        int numbersSum = GetNumbersSum(array);
        int arithmeticMean = numbersSum/(array.length);
        return arithmeticMean;
    }
}
