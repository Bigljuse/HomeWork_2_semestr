package ru.mirea.lab1.HomeWork2.HomeWork2_4;

public class Computer
{
    private int Id = 0;
    private String Name = "No pc name";

    Computer(int id, String name)
    {
        Id = id;
        Name = name;
    }

    public String GetName()
    {
        return Name;
    }

    public int GetId()
    {
        return Id;
    }
}
