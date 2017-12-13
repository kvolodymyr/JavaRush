package com.javarush.task.task18.task1818;

/* 
Два в одном
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

        FileOutputStream outputStream1 = new FileOutputStream(file1);

        FileInputStream inputStream1 = new FileInputStream(file2);
        FileInputStream inputStream2 = new FileInputStream(file3);

        while (inputStream1.available()>0) {
            byte[] buf = new byte[inputStream1.available()];
            inputStream1.read(buf);
            outputStream1.write(buf);
        }

        inputStream1.close();

        //File3 append to File1
        while (inputStream2.available()>0) {
            byte[] buf = new byte[inputStream2.available()];
            inputStream2.read(buf);
            outputStream1.write(buf);
        }

        inputStream2.close();
        outputStream1.close();

    }
}
