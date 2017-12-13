package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = cReader.readLine(), fileName2 = cReader.readLine();
        cReader.close();

        BufferedReader fReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileName2));

        while(fReader.ready()) {
            for(String s: fReader.readLine().split("\\s")) {
                try {
                    System.out.println(Integer.parseInt(s));
                    fWriter.write(s + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }

        fReader.close();
        fWriter.close();
    }
}
