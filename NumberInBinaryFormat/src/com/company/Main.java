package com.company;

// Ввести с консоли число в бинарном формате.
// Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String sBin = sc.nextLine();
        int iBin = 0;
        for (int i = sBin.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            iBin += (sBin.charAt(i) - '0') * j;
        }
        System.out.println("sBin:" + iBin);
    }
}
