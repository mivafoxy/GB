package com.company.mivafox;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/

public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        System.out.println("Cat:");

        cat.run(200);
        cat.run(250);
        cat.swim(100);

        System.out.println("Dog:");

        dog.run(450);
        dog.run(550);
        dog.swim(9);
        dog.swim(100);

        AnimalFactory animalFactory = new AnimalFactory();

        Animal newCat = animalFactory.newCat();
        Animal newDog = animalFactory.newDog();

        System.out.println("Animals: " + animalFactory.getAnimalsTotal());
        System.out.println("Cats: " + animalFactory.getCatsTotal());
        System.out.println("Dogs: " + animalFactory.getDogsTotal());

        System.out.println("new Cat:");

        System.out.println("Can't swim, max run: " + newCat.maxRunLength);

        newCat.run(200);
        newCat.run(250);
        newCat.swim(100);

        System.out.println("new Dog:");
        System.out.println("max swim: " + newDog.maxSwimLength +", max run: " + newDog.maxRunLength);


        newDog.run(450);
        newDog.run(550);
        newDog.swim(9);
        newDog.swim(100);
    }
}
