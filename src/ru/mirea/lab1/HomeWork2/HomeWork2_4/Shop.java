package ru.mirea.lab1.HomeWork2.HomeWork2_4;

public class Shop
{
    private Computer[] computersArray = null;
    private int maxComputersCount = 0;
    private int computersCount = 0;

    Shop(int computerCount)
    {
        maxComputersCount = computerCount;
        computersArray = new Computer[computerCount];
    }

    public void AddComputer(String computerName)
    {
        Computer newComputer = new Computer(computersCount + 1, computerName);
        computersArray[computersCount] = newComputer;
        computersCount++;
    }

    public void DeleteComputer(String computerName)
    {
        Computer[] computers = new Computer[computersCount - 1];

        int counter = 0;

        for (Computer computer: computersArray)
        {
            if(computer.GetName() == computerName)
                continue;

            computers[counter] = computer;
            counter++;
        }

        computersCount--;
    }

    public Computer FindComputer(String computerName)
    {
        for (Computer computer: computersArray)
        {
            if(computer.GetName() == computerName)
                return computer;
        }
        return null;
    }

    public int GetCurrentComputersCount()
    {
        return computersCount;
    }

    public int GetMaxComputersCount()
    {
        return maxComputersCount;
    }

    public String ToString()
    {
        StringBuffer computers = new StringBuffer();
        for (Computer computer : computersArray)
        {
            computers.append(String.format("%s) %s\n",computer.GetId(),computer.GetName()));
        }

        return computers.toString();
    }
}
