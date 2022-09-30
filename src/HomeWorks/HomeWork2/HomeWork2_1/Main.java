package HomeWorks.HomeWork2.HomeWork2_1;

public class Main
{
    public static void main(String[] args)
    {
        Author author = new Author("Андрей", "lala@mail.ru", 'M');
        System.out.println(String.format("%s %s %s",author.GetName(), author.GetEmail(), author.GetGender()));

        author.SetEmail("he@mail.ru");

        System.out.println(author.ToString());
    }
}
