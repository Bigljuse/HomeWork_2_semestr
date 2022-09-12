package ru.mirea.lab1.HomeWork2.HomeWork2_5;

public class DogsHouse
{
    private static Dog[] dogsArray = new Dog[0];

    public static void Start()
    {
        Dog[] dogsIncomingArray = {
                new Dog("Дэк",3),
                new Dog("Арни",1),
                new Dog("Тор",5)
        };
        AddDog(dogsIncomingArray);

        for (Dog dog: dogsArray) {
            System.out.println(dog.toString());
        }
    }

    public static void AddDog(Dog[] newDogs)
    {
        Dog[] newDogsArray = new Dog[dogsArray.length + newDogs.length];

        int counter = 0;
        for (Dog dog : dogsArray)
        {
            newDogsArray[counter] = dog;
            counter++;
        }

        for (Dog newDog : newDogs)
        {
            newDogsArray[counter] = newDog;
            counter++;
        }

        dogsArray = newDogsArray;
    }
}
