package com.company;

// Произведите ввод данных с клавиатуры в массив,
// а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2.
// Размер массива задается пользователем.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Введенные элементы массива умноженные на 2:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + (array[i]*2));
        }
    }
}
