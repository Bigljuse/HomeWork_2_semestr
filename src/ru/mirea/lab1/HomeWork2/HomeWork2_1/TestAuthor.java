package ru.mirea.lab1.HomeWork2.HomeWork2_1;

import ru.mirea.lab1.HomeWork2.HomeWork2_1.Author;

public class TestAuthor
{
    public static void Start()
    {
        Author author = new Author("Андрей", "lala@mail.ru", 'M');
        System.out.println(String.format("%s %s %s",author.GetName(), author.GetEmail(), author.GetGender()));

        author.SetEmail("he@mail.ru");

        System.out.println(author.ToString());
    }
}
