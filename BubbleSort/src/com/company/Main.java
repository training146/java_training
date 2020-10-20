package com.company;

// Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Использовать пузырьковый метод сортировки.

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
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("Введенные элементы массива:");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
    }
}
