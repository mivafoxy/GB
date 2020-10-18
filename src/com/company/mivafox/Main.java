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
    public static void main(String[] args) {
         Employee[] employee  = new Employee[5];
        employee[0] = new Employee("Петров Александр Иванович", "Директор", "petrovai@mail.ru", "+79263472378", 82000.20, 45);
        employee[1] = new Employee("Иванова Оксана Алексеевна", "секретарь", "ivanovaoksi@yandex.com", "+79772465129", 45000, 25);
        employee[2] = new Employee("Сидоров Олег Николаевич", "водитель",null, "+79993728761", 25000.99, 41);
        employee[3] = new Employee("Никитин Дмитрий Сергеевич", "Менеджер", "dimanikinin90@gmail.com", "+79161678902", 54000, 57);
        employee[4] = new Employee("Соколов Иван Олегович", "доставщик", null, "+79992348902", 18000, 18 );

        for(int i = 0; i<employee.length; i++) {
            if(employee[i].getAge() > 40) {
                employee[i].printInfo();
            }
        }

    }
}
