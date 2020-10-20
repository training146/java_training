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
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter("File.txt"))) {
                while (!(sLine = reader.readLine()).equals("стоп")) {
                    i++;
                    if (i < limit){
                        sLine = sLine + "\r\n";
                    }
                    if (i == limit) {
                        writter.write(sLine);
                        break;
                    }
                    writter.write(sLine);
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода вывода: " + ex);
        }
    }
}

