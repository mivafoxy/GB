package com.company.mivafox;

import java.util.Scanner;

public class Game1 {
    Scanner scanner = new Scanner(System.in);
    int userNumber;
    int count = 0;
    int targetNumber;
    boolean isTrue = true;

    public void gameStart() {
        while (isTrue) {
            System.out.println("Компьютер загадал число от 0 до 9. Ваша задача отгадать его");
            targetNumber = (int) (Math.random() * 10);

            while (count < 3 && isTrue) {
                System.out.println("Какое это число?");
                userNumber = scanner.nextInt();
                if (userNumber > targetNumber) {
                    System.out.println("Загаданное число меньше");
                    count++;
                } else if (userNumber < targetNumber) {
                    System.out.println("Загаданное число больше");
                    count++;
                } else {
                    System.out.println("Вы угадали! Вы справились за " + (count + 1) + " попытки.");
                    break;
                }
                if (count == 3) {
                    System.out.println("Вы проиграли!");
                    break;
                }
            }
            choice();
        }
    }

    public  void choice() {
        System.out.println("Повторить игру еще раз? ДА - нажмите 1, НЕТ - нажмите 0.");
        int x = scanner.nextInt();
        switch (x) {
            case (0):
                isTrue = false;
                break;
            case (1):
                count = 0;
                break;
        }
    }
}