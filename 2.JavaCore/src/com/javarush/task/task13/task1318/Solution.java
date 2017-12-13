package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out, "Cp850"));

        String sourceFileName = reader.readLine();

        InputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sourceFileName);
        } catch(FileNotFoundException ex) {
            System.out.println("Файл не найден.");

        }
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            writer.write(data);
        }
        fileInputStream.close();
        reader.close();
        writer.close();
    }
}