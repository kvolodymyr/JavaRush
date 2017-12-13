package com.javarush.task.task18.task1801;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception, IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        File file = new File(fileName);
        InputStream stream = new FileInputStream(file);
        long length = file.length();
        byte[] bytes = new byte[(int) length];

        stream.read(bytes);
        stream.close();
        byte max = Byte.MIN_VALUE;
        for(int i = 0; i < bytes.length; i++) {
            if (max < bytes[i]) max = bytes[i];
            if(max == Byte.MAX_VALUE) break;
        }
        System.out.println(String.valueOf(max));

    }
}
