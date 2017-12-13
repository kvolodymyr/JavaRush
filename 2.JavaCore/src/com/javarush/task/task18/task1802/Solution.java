package com.javarush.task.task18.task1802;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        File file = new File(fileName);
        InputStream stream = new FileInputStream(file);
        long length = file.length();
        byte[] bytes = new byte[(int) length];

        stream.read(bytes);
        stream.close();
        byte min = Byte.MAX_VALUE;
        for(int i = 0; i < bytes.length; i++) {
            if (min > bytes[i]) min = bytes[i];
            if(min == Byte.MIN_VALUE) break;
        }
        System.out.println(String.valueOf(min));
    }
}
