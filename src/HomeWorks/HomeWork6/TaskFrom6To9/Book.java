package HomeWorks.HomeWork6.TaskFrom6To9;

import java.util.Random;

public class Book implements Printable
{

    public void print()
    {
        System.out.print(String.format("Книга с номером тома: %s\n", new Random().nextInt(10)));
    }
}
