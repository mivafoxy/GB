package com.company.mivafox;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee
{
    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    // Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String FIO, String position, String email, String phoneNumber, float salary, int age)
    {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void printInfo()
    {
        System.out.println("Ф.И.О: " + FIO);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public int getAge()
    {
        return age;
    }
}
