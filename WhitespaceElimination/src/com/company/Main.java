package com.company;

// Для введенной с клавиатуры строки необходимо провести отсев пробелов.
// Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scan.nextLine();
        String b = s.replaceAll(" ", "");
        System.out.println(b);
    }
}
