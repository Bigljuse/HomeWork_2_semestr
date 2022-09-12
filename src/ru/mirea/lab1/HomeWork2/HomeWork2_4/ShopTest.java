package ru.mirea.lab1.HomeWork2.HomeWork2_4;

import java.util.Scanner;

public class ShopTest
{
    public static void Start()
    {
        System.out.print("Введите количество компьютеров: ");
        Scanner scanner = new Scanner(System.in);

        int computersCount = scanner.nextInt();
        Shop shop = new Shop(computersCount);

        String inputedComputerName = "No pc name";
        while(shop.GetCurrentComputersCount() < shop.GetMaxComputersCount())
        {
            System.out.print(String.format("Название компьютера под № %s: ", shop.GetCurrentComputersCount() + 1));
            inputedComputerName = scanner.next();
            shop.AddComputer(inputedComputerName);
            System.out.println("Компьютер : " + inputedComputerName + " добавлен в магазин");
        }

        System.out.println(String.format("Компьютеры в магазине базы данных: \n%s", shop.ToString()));
    }
}
