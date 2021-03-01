package com.company.mivafox;

//  Создать классы Собака и Кот с наследованием от класса Животное.
public abstract class Animal
{
    // У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    protected float maxRunLength;
    protected float maxSwimLength;

    public Animal(float maxRunLength, float maxSwimLength)
    {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }

    // Животные могут выполнять действия: бежать, плыть. В качестве параметра каждому методу передается величина, означающая длину препятствия.
    // При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)

    public void run(float length)
    {
        System.out.println("run: " + isAvailableAction(length, maxRunLength));
    }

    public void swim(float length)
    {
        System.out.println("swim: " + isAvailableAction(length, maxSwimLength));
    }

    private boolean isAvailableAction(float required, float expected)
    {
        return required <= expected;
    }
}
