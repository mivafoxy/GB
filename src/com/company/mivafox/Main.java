package com.company.mivafox;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    /*
    1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы
     */

    public static void main(String[] args)
    {
        System.out.println("1 - угадываем номер, 2 - угадываем слово.");
        switch (getNumberFromConsole())
        {
            case 1:
                guessNumber();
                break;
            case 2:
                guessTheWord();
                break;
        }
    }

    /*
         Написать программу, которая загадывает случайное число от 0 до 9, и
         пользователю дается 3 попытки угадать это число.
         При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
         После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
         (1 – повторить, 0 – нет).
    */
    static void guessNumber()
    {
        // Рандомайзер от 0 до 9
        Random random = new Random();

        // Цикл с постусловием - как в примере с урока 2.
        // Ждём ввод от пользователя, затем что-то проверяем.
        do
        {
            int expectedNumber = random.nextInt(10);

            for (int i = 2; i >= 0; i--)
            {
                int userNumber;
                do
                {
                    System.out.println("Введите число от 0 до 9.");
                    userNumber = getNumberFromConsole();
                }
                while (!(0 <= userNumber && userNumber <= 9));

                if (userNumber == expectedNumber)
                {
                    System.out.println("Вы угадали!");
                    break;
                }
                else if (userNumber < expectedNumber)
                {
                    System.out.println("Загаданное число больше введённого.");
                }
                else if (userNumber > expectedNumber)
                {
                    System.out.println("Загаданное число меньше введённого.");
                }
                System.out.println("Вы не угадали, у Вас осталось попыток: " + i);
            }

            System.out.println("Попробовать ещё раз? (остальное - да/0 - нет)");

        }
        while (getNumberFromConsole() != 0);
    }

    // Проверка входных данных.
    static int getNumberFromConsole()
    {
        Scanner scanner = new Scanner(System.in);

        do
        {
            if (scanner.hasNextInt())
            {
                return scanner.nextInt();
            }

            System.out.println("Введите целое число!");
            scanner.nextLine();
        }
        while (true);
    }

    /*
    Создать массив из слов String[] words =
    {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
     "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
     "pumpkin", "potato"};

    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы
     */
    public static void guessTheWord()
    {
        Random random = new Random();

        String[] words =
            {
                "apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
            };

        int expectedWordIndex = random.nextInt(words.length);
        String expectedWord = words[expectedWordIndex];
        System.out.println("Загадано: " + expectedWord);

        String userWord;
        Scanner scanner = new Scanner(System.in);
        do
        {
            userWord = scanner.nextLine();

            if (userWord.equals(expectedWord))
            {
                System.out.println("Угадано!");
            }
            else
            {
                doAdvise(userWord, expectedWord);
            }
        }
        while (!(userWord.equals(expectedWord)));
    }

    static void doAdvise(String userWord, String expectedWord)
    {
        String advise = "";
        for (int i = 0; i < 15; i++)
        {
            if (i >= userWord.length() || i >= expectedWord.length())
            {
                advise += "#";
            }
            else if (userWord.charAt(i) == expectedWord.charAt(i))
            {
                advise += userWord.charAt(i);
            }
            else
            {
                advise += "#";
            }
        }

        System.out.println(advise);
    }

}
