package com.company.mivafox;

//  Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal
{
    public Cat(float maxRunLength)
    {
        super(maxRunLength, 0);
    }

    @Override
    public void swim(float length)
    {
        System.out.println("Cats can't swim!");
    }
}
