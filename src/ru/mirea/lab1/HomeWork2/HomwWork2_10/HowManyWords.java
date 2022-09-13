package ru.mirea.lab1.HomeWork2.HomwWork2_10;

import java.util.Scanner;

public class HowManyWords
{
    public static void Start()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели " + text.split(" ").length + " слов" );
    }
}
