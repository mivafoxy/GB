package com.company.mivafox;

public class Main
{
    /*
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
     */
    public static void main(String[] args)
    {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Dusya", 5);
        cats[1] = new Cat("Murzik", 7);
        cats[2] = new Cat("Myshkin", 10);

        Plate plate = new Plate(20);

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }

        appendFoodTo(plate, 50);

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }
    }

    static void appendFoodTo(Plate plate, int food)
    {
        plate.increaseFood(food);
    }
}
