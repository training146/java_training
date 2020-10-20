package com.company;

// Необходимо написать программу, которая будет реализовывать следующие действия:
// 1. Ввод числа с клавиатуры и запись его в строковую переменную S
// 2. Конвертация строковой переменной S в числовую переменную X типа int
// 3. Конвертация числа X типа int в число Y типа double
// Все три числа разных типов необходимо в столбик вывести на экран

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число с клавиатуры: ");
        String S = scan.nextLine();
        int X = Integer.parseInt (S.trim ());
        double Y = X;
        System.out.println("Cтроковая переменная S: "+S);
        System.out.println("Переменная типа int X: "+X);
        System.out.println("Переменная типа double Y: "+Y);
    }
}
