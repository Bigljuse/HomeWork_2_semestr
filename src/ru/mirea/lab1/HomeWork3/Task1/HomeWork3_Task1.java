package ru.mirea.lab1.HomeWork3.Task1;

public class HomeWork3_Task1
{

    public static void Start()
    {
        double aDouble = Double.valueOf(3.14);
        aDouble = Double.parseDouble("3.14");

        int aInt = (int)aDouble;
        float aFloat = (float) aDouble;
        byte aByte = (byte)aDouble;
        char aChar = (char)aDouble;
        short aShort = (short)aDouble;
        long aLong = (long)aDouble;
        boolean aBoolean = aDouble > 0 ? true: false;
        String d = Double.toString(3.14);
    }
}
