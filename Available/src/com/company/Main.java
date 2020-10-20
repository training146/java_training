package com.company;

// Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
// В программе должны присутствовать константы X, Y, Z.
// Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
// Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int X = 3, Y = 5, Z = 9;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число в переменную number:");
        int number = scn.nextInt();

        switch (number){
            case X: System.out.println ("Данное значение имеется в константах"); break;
            case Y: System.out.println ("Данное значение имеется в константах"); break;
            case Z: System.out.println ("Данное значение имеется в константах"); break;
            default: System.out.println("Такой константы нет!");
        }
    }
}
