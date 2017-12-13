package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.next();
        String file2 = scanner.next();

        byte[] buffer = new byte[0];

        FileInputStream inputStream = new FileInputStream(file1);
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
        }
        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file1);
        inputStream = new FileInputStream(file2);
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer2 = new byte[inputStream.available()];
            inputStream.read(buffer2);
            outputStream.write(buffer2);
        }
        outputStream.write(buffer);

        outputStream.close();
        inputStream.close();
    }
}
