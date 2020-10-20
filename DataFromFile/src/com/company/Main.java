package com.company;

// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt")))
        {
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException ex){
            System.out.println("Ошибка ввода вывода: " + ex);
        }
    }
}
