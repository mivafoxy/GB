package com.company.mivafox;

import java.util.Random;

public class AnimalFactory
{
    private int animalsTotal;
    private int catsTotal;
    private int dogsTotal;

    public Cat newCat()
    {
        Random random = new Random();

        float maxRun = random.nextInt(200) + random.nextFloat();

        Cat cat = new Cat(maxRun);

        incrementCatsCount();

        return cat;
    }

    public Dog newDog()
    {
        Random random = new Random();

        float maxRun = random.nextInt(200) + random.nextFloat();
        float maxSwim = random.nextInt(50) + random.nextFloat();

        Dog dog = new Dog(maxRun, maxSwim);

        incrementDogsCount();

        return dog;
    }

    public int getAnimalsTotal()
    {
        return animalsTotal;
    }

    public int getCatsTotal()
    {
        return catsTotal;
    }

    public int getDogsTotal()
    {
        return dogsTotal;
    }

    private void incrementCatsCount()
    {
        catsTotal++;
        animalsTotal++;
    }

    private void incrementDogsCount()
    {
        dogsTotal++;
        animalsTotal++;
    }
}
