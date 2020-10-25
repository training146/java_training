package com.company;

// Напишите программу конвертер валют.
// Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.
// Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
//
// Курс доллара = 77.78, Количество рублей: 1000.0, Итого: 12.856775520699408 долларов

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double usdCourse = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rubCount = scanner.nextDouble();
        System.out.println("Курс доллара = " + usdCourse + ", Количество рублей: " + rubCount + ", Итого: "+ String.format("%.2f", (rubCount/usdCourse))+" долларов");
    }
}
