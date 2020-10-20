package com.company;

// Произведите ввод данных с клавиатуры в матрицу,
// а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3.
// Размерность матрицы задается пользователем.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int size = input.nextInt();
        int size2 = input.nextInt();
        int array[][] = new int[size][size2];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < size; i++) {
            for (int t = 0; t < size2; t++) {
                array[i][t] = input.nextInt();
            }
        }
        System.out.print ("Введенные элементы первой строки матрицы умноженные на 3:");
        for (int i = 0; i < size2; i++) {
            System.out.print(" " + (array[0][i] * 3));
        }
    }
}
