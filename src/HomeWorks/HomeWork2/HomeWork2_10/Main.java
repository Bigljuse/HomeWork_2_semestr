package HomeWorks.HomeWork2.HomeWork2_10;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели " + text.split(" ").length + " слов" );
    }
}
