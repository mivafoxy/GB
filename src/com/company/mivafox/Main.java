package com.company.mivafox;

public class Main
{
/*
* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/
    public static void main(String[] args)
    {
        // Создать массив из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] =
            new Employee(
                "Ivanov Ivan Ivanovich",
                "Programmer",
                "sampleOne@mail.ru",
                "+7-999-999-99-99",
                100000,
                46);

        employees[1] =
            new Employee(
                "Tulkin Evgeny Borisovich",
                "Administrator",
                "sampleTwo@mail.ru",
                "+7-999-888-77-66",
                80000,
                25);

        employees[2] =
            new Employee(
                "Lubotkina Alexandra Viktorovna",
                "Secretary",
                "sampleThree@mail.ru",
                "+7-989-111-22-33",
                50000,
                34);

        employees[3] =
            new Employee(
                "Bulatova Anastasia Krasotkina",
                "Programmer",
                "sampleFour@mail.ru",
                "+7-999-222-33-44",
                150000,
                33);

        employees[4] =
            new Employee(
                "Ivanov Evgeniy Evgenievich",
                "IT-administrator",
                "sampleFour@mail.ru",
                "+7-444-222-33-00",
                130000,
                44);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].getAge() > 40)
            {
                employees[i].printInfo();
            }
        }
    }
}
