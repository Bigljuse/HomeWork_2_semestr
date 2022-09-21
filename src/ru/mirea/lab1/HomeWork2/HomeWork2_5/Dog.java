package ru.mirea.lab1.HomeWork2.HomeWork2_5;

public class Dog
{
    private String tag = "";
    private int age = 0;

    Dog(String tag, int age)
    {
        this.tag = tag;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        age = age;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag(int age)
    {
        tag = tag;
    }

    public int GetDogAgeInHumanAge()
    {
        return age * 7;
    }

    public String toString()
    {
        return String.format("Собака: %s, Возраст: %s",tag, GetDogAgeInHumanAge());
    }
}
