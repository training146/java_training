package com.company;

// Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствующее сообщение.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String s1 = scan.nextLine();
        int l1 = s1.length();
        System.out.println("Введите строку 2: ");
        String s2 = scan.nextLine();
        int l2 = s2.length();
        if (l1 > l2){
            System.out.println( "Строка \""+ s1 +"\" длинее.");
        }
        if (l1 < l2){
            System.out.println( "Строка \""+ s2 +"\" длинее.");
        }
        if (l1 == l2){
            System.out.println( "Строки \""+ s1 +"\" и \""+ s2 +"\" равны.");
        }
    }
}
