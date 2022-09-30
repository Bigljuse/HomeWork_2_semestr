package HomeWorks.HomeWork6.TaskFrom6To9;

public class Main
{
    private static Printable[] printables = new Printable[]
            {
                    new Shop(),
                    new Book(),
                    new Shop(),
                    new Book(),
                    new Book(),
                    new Shop()
            };

    public static void main(String args[])
    {
        for(Printable printable : printables)
        {
            printable.print();
        }
    }
}
