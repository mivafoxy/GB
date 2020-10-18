package com.company.mivafox;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee
{
   private String FIO;
   private String position;
   private String email;
   private String phone;
   private double salary;
   private int age;

   Employee(String FIO, String position, String email, String phone, double salary, int age) {
       this.FIO = FIO;
       this.position = position;
       this.email = email;
       this.phone = phone;
       this.salary = salary;
       this.age = age;
   }
   public void printInfo() {
       System.out.println("ФИО: " + FIO);
       System.out.println("Должность " + position);
       System.out.println("email: " + email);
       System.out.println("Телефон: " + phone);
       System.out.println("Зарплата: " + salary);
       System.out.println("Возраст: " + age);
   }

    public int getAge() {
        return age;
    }
}
