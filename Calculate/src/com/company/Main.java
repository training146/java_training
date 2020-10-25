package com.company;

// Написать программу, которая будет выполнять следующие действия:
//      1. Ввод трех чисел с клавиатуры x, y, z
//      2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//      3. Деление среднего арифметического на 2 без остатка
//      4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int x = scn.nextInt();
        System.out.println("Введите число 2:");
        int y = scn.nextInt();
        System.out.println("Введите число 3:");
        int z = scn.nextInt();
        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел:" + average);
        int averageBy2 = (int) Math.round(average / 2);
        if (averageBy2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
