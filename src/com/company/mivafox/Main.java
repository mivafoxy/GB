package com.company.mivafox;

import java.util.Arrays;

/**
 * Домашнее задание №2.
 */
public class Main
{
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
     * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    // Точка входа, в которой мы начинаем наше программирование, всегда.
    public static void main(String[] args)
    {
        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("Task 1.");
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }; // Делаем это вне метода, так как это - входные данные.

        System.out.println(Arrays.toString(array));
        changeArray(array);
        System.out.println(Arrays.toString(array)); // Многие нашли удобный способ вывода массива в консоль.

        /**
         * 2. Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        System.out.println("Task 2.");
        int[] emptyArray = new int[8]; // Задать пустой массив.

        System.out.println(Arrays.toString(emptyArray));
        fillArray(emptyArray);
        System.out.println(Arrays.toString(emptyArray));

        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом,
         * и числа меньшие 6 умножить на 2;
         */
        System.out.println("Task 3.");
        int[] myArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; // Задали массив.

        System.out.println(Arrays.toString(myArray));
        multiplyIn(myArray);
        System.out.println(Arrays.toString(myArray));

        /**
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
         * с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

        System.out.println("Task 4.");

        int[][] square = new int[10][10]; // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        System.out.println("With zeroes");
        printSquare(square);

        fillDiagonalWithOnes(square);
        System.out.println("With ones.");
        printSquare(square);

        /**
         * 5. ** Задать одномерный массив и
         * найти в нем минимальный и
         * максимальный элементы
         * (без помощи интернета);
         */

        System.out.println("Task 5.");

        int[] minMaxArray = { 1, 2, 7, 4, 0 }; // Задать одномерный массив
        System.out.println(Arrays.toString(minMaxArray));

        printMinAndMax(minMaxArray);

        /**
         * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
         * Примеры:
         * checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
         * checkBalance([1, 1, 1, || 2, 1]) → true,
         * граница показана символами ||, эти символы в массив не входят.
         */

        System.out.println("Task 6.");

        int[] sumsArray = { 1, 1, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(sumsArray));
        boolean isBalanced = hasBalance(sumsArray);
        System.out.println("Суммы правой и левой части где либо равны? " + isBalanced);

        /**
         * 7. **** Написать метод, которому на вход подается одномерный массив и число n
         * (может быть положительным, или отрицательным),
         * при этом метод должен сместить все элементы массива на n позиций.
         * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         */

        System.out.println("Task 7.");

        // одномерный массив и число n
        int[] rightShiftArray = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(rightShiftArray));
        shiftArray(rightShiftArray, 3);
        System.out.println(Arrays.toString(rightShiftArray));


        int[] leftShiftArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(leftShiftArray));
        shiftArray(leftShiftArray, -5);
        System.out.println(Arrays.toString(leftShiftArray));
    }

    static void printSquare(int[][] inputSquare)
    {
        for (int i = 0; i < inputSquare.length; i++)
        {
            System.out.println(Arrays.toString(inputSquare[i]));
        }
    }

    // Метод, заменяющий в массиве 1 на 0, а 0 на 1.
    static void changeArray(int[] inputArray) // Массивы - это ссылочные типы. То есть, по сути,
    {                                         // в метод передаётся адрес, на который указывает входной аргумент.
        // С помощью цикла                    // А значит - любые изменения массива внутри метода в результате окажутся в array из main.
        for (int i = 0; i < inputArray.length; i++)
        {
            // используем условие
//            inputArray[i] = (inputArray[i] == 1) ? 0 : 1;

            // Можно сделать проще.
            inputArray[i] = 1 - inputArray[i];
        }
    }

    // Метод, заполняющий массив [0 3 6 9 12 15 18 21]
    static void fillArray(int[] inputArray)
    {
        // С помощью цикла заполнить его значениями
        for (int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = i * 3;
        }
    }

    // Домножение элементов массива
    static void multiplyIn(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) // пройти по нему циклом
        {
            // числа меньшие 6 умножить на 2
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

    // Заполнение диагонали единицами.
    static void fillDiagonalWithOnes(int[][] square)
    {
        //с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        for (int i = 0; i < square.length; i++)
        {
            // диагональные элементы имеют одинаковые индексы
            square[i][i] = 1;

            // заполнение другой диагонали
            square[i][square[i].length - 1 - i] = 1;
        }
    }

    // Поиск минимального и максимального элемента.
    static void printMinAndMax(int[] inputArray)
    {
        int min = inputArray[0];
        int max = inputArray[0];

        // простой перебор массива.
        for (int i = 0; i < inputArray.length; i++)
        {
            if (min > inputArray[i])
            {
                min = inputArray[i];
            }

            if (max < inputArray[i])
            {
                max = inputArray[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // Проверка частей массива
    static boolean hasBalance(int[] inputArray)
    {
        int leftSum = 0;
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        for (int i = 0; i < inputArray.length; i++)
        {
            leftSum += inputArray[i];

            int rightSum = 0;
            for (int j = (i + 1); j < inputArray.length; j++)
            {
                rightSum += inputArray[j];
            }

            if (leftSum == rightSum)
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    // Метод для сдвига в массиве.
    static void shiftArray(int[] array, int shift)
    {
        // В какую сторону надо перемещать элементы массива?
        if (isNegative(shift))
        {
            // Цикл идёт влево.
            for (int i = 0; i > shift; i--)
            {
                leftShift(array);
            }
        }
        else
        {
            // Цикл идёт вправо.
            for (int i = 0; i < shift; i++)
            {
                rightShift(array);
            }
        }
    }

    static void rightShift(int[] inputArray)
    {
        // первым делом - заменить первый элемент последним. Но первый элемент терять нельзя.
        int buffer = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[inputArray.length - j] = inputArray[inputArray.length - j - 1];
        }

        inputArray[1] = buffer;
    }

    static void leftShift(int[] inputArray)
    {
        int buffer = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[0];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[j - 1] = inputArray[j];
        }

        inputArray[inputArray.length - 2] = buffer;
    }

    static boolean isNegative(int number)
    {
        return number < 0;
    }
}
