package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(args[0]);
        int total = 0;
        int spaces = 0;
        while(reader.ready()){
            int code = reader.read();
            total++;
            if(code == 32) {
                spaces++;
            }
        }
        reader.close();
        System.out.println(String.format("%.2f", ((float) spaces / total) * 100));
    }
}
