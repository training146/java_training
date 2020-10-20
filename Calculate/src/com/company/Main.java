package com.company;

// Написать программу, которая будет выполнять следующие действия:
//      1. Ввод трех чисел с клавиатуры x, y, z
//      2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//      3. Деление среднего арифметического на 2 без остатка
//      4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y, z, u;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число 1:");
        x = scn.nextInt();
        System.out.println("Введите число 2:");
        y = scn.nextInt();
        System.out.println("Введите число 3:");
        z = scn.nextInt();
        u = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел:"+u);
        u = u/2;
        if (u > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
