package HomeWorks.HomeWork7.Task4;

public class Main
{
    public static void main(String args[])
    {
        MathCalculable mathFunc = new MathFunc();

        int radious = 10;
        int lengthOfCircle =  (int)(2 *radious * mathFunc.getPi());

        System.out.println(String.format("Длина круга: %s", lengthOfCircle));
    }
}
