package ru.mirea.lab1.HomeWork6.Task11;

public class Converter implements IConverter
{
    @Override
    public float convert(float farengeit) {
        float converted = (float) 5/9*(farengeit - 32);
        return converted;
    }
}
