package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = cReader.readLine(), fileName2 = cReader.readLine();
        cReader.close();

        FileReader fReader = new FileReader(fileName1);
        FileWriter fWriter = new FileWriter(fileName2);

        int i=1;
        while (fReader.ready()) {
            int value = fReader.read();
            if (i % 2 == 0) {
                fWriter.write(value);
            }
            i++;
        }
        fReader.close();
        fWriter.close();
    }
}
