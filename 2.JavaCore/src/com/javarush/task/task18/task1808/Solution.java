package com.javarush.task.task18.task1808;

/* 
Разделение файла
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
        String file3 = scanner.next();

        FileInputStream inputStream = new FileInputStream(file1);

        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            int off = 0;
            int len = count / 2 + (count % 2 == 0 ? 0 : 1);
            outputStream1.write(buffer, off, len);
            off = len;
            outputStream2.write(buffer, off, count /2);
        }

        inputStream.close();

        outputStream1.close();
        outputStream2.close();
    }
}
