package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.next();
        String file2 = scanner.next();

        FileInputStream inputStream = new FileInputStream(file1);

        FileOutputStream outputStream1 = new FileOutputStream(file2);

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for(int i = buffer.length - 1; i >= 0; i--) {
                outputStream1.write(buffer[i]);
            }
        }

        inputStream.close();

        outputStream1.close();
    }
}
