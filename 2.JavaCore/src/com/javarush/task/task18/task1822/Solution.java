package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        scanner.close();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
            String s = reader.readLine();
            if (s.startsWith(args[0]))
                System.out.println(s);
        }
        reader.close();
    }
}
