package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        StringBuffer buffer = new StringBuffer("");
        while (fileReader.ready()) {
            String[] words = fileReader.readLine().split(" ");
            for (String word : words) {
                if (word.length() > 6) {
                    buffer.append(word).append(",");
                }
            }
        }
        buffer.delete(buffer.length()-1,buffer.length());
        fileWriter.write(buffer.toString());
        fileWriter.close();
        fileReader.close();
    }
}
