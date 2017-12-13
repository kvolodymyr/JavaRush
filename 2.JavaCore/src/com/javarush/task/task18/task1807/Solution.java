package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        FileInputStream stream = new FileInputStream(fileName);
        int count = 0;

        if(stream.available() > 0) {
            byte[] bytes = new byte[stream.available()];
            stream.read(bytes);

            Byte comma = ",".getBytes("US-ASCII")[0];
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] == comma) count++;
            }
        }
        stream.close();

        System.out.println(String.valueOf(count));
    }
}
