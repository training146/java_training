package com.company;

//  Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
//  Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
//  Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sLine = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для окончания записи в файл введите \"стоп\"");
        try (FileWriter fw = new FileWriter("file.txt")) {
            while (sLine.compareTo("стоп") != 0) {
                System.out.print(": ");
                sLine = br.readLine();
                if (sLine.compareTo("стоп") != 0) fw.write(sLine + "\r\n");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода вывода: " + ex);
        }
    }
}