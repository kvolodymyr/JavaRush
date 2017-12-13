package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));

        int total = 0;
        while (reader.ready()) {
            String line = reader.readLine();
            for(String word: line.split("\\W")) {
                if (word.equals("world")) {
                    total++;
                }
            }
        }
        reader.close();

        System.out.println(total);
    }
}
