package ru.mirea.lab1.HomeWork3.Task4;

public class HomeWork3_4_Task3
{
    private static Employee[] employees;

    public static void Start()
    {

        employees = new Employee[]
                {
                        new Employee("Боб", 500),
                        new Employee("Бобыч", 3200),
                        new Employee("Артём", 800),
                        new Employee("Шишкин", 3954),
                        new Employee("Гена", 20000)
                };

        System.out.println(Report.GenerateReport(employees));
    }
}
