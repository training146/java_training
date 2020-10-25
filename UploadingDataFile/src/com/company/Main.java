package com.company;

// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String line = "";
        readerFile(line);
    }

    public static void readerFile (String line){
        int iLine = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("File.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                iLine++;
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода вывода: " + ex);
        }
        writingFile(line, iLine);
    }
    public static void writingFile(String sLine, int limit){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter("File.txt"))) {
                for (int i = 1; i <= limit ; i++){
                    sLine = reader.readLine();
                    if (i < limit){
                        writter.write(sLine + "\r\n");
                    } else {
                        writter.write(sLine);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода вывода: " + ex);
        }
    }
}

