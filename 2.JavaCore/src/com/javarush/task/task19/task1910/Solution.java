package com.javarush.task.task19.task1910;

/* 
Пунктуация
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
            fWriter.write(fReader.readLine().replaceAll("[\\p{Punct}\\n]",""));
        }

        fReader.close();
        fWriter.close();
    }
}
