package com.company.mivafox;

import java.util.Scanner;

public class Game2 {
    Scanner scanner = new Scanner(System.in);
    String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
            "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};
    boolean isTrue = true;
    String userWord;
    String target;
    StringBuilder hint = new StringBuilder("###############");
    public void game2Start() {
        int length = words.length;
        System.out.println("Ваша задача угадать одно из " + length + " слов." + "/n" +
        " Игра будит продолжаться до тех пор пока вы не угадаете слово.");
        int random = (int) (Math.random() * length);
        target = words[random];
        while (isTrue) {
            userWord = scanner.nextLine();
            if (userWord.equals(target)) {
                System.out.println("Вы угадали! Поздравляем!");
                isTrue = false;
                break;
            }
            else
                hint = hint(userWord, target);
            System.out.println("Вы не угадали слово, но возможно вы угадали некоторые буквы "+ hint);
        }


    }

    public StringBuilder hint(String userWord, String target) {
        if(target.length()>userWord.length()) {
            for (int i = 0; i < userWord.length(); i++) {
                if (target.charAt(i) == userWord.charAt(i)) hint.insert(i, target.charAt(i));
            }
        }
        else
            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) == userWord.charAt(i)) hint.insert(i, target.charAt(i));
            }
        return hint;
    }

}
