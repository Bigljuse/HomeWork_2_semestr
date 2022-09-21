package ru.mirea.lab1.HomeWork3.Task4;

public class Employee
{
    private String fullname = "no name";
    private int salary = 0;

    Employee(String name, int salaryAmount)
    {
        fullname = name;
        salary = salaryAmount;
    }

    public int GetSalary() {
        return salary;
    }

    public String GetFullname() {
        return fullname;
    }
}
