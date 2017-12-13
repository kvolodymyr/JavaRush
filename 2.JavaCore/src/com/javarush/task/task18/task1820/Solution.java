package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.next();
        String file2 = scanner.next();

        // Читаем файл
        ArrayList<String> lines = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        ArrayList<Long> values = new ArrayList<Long>();
        for (String s : lines) {
            for (String part : s.split(" ")) {
                double a = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }

        FileWriter writer = new FileWriter(file2);
        for (Long value : values) {
            writer.write(value.toString() + " ");
        }
        writer.close();
    }
}
