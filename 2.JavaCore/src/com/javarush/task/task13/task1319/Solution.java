package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OutputStream fileOutputStream = null;
        String destFileName = reader.readLine();
        ArrayList<String> data = new ArrayList<>();
        String text;
        do{
            text = reader.readLine();
            data.add(text);
        } while(!text.equals("exit"));
        try {
            fileOutputStream = new FileOutputStream(destFileName);
        } catch(FileNotFoundException ex) {
            System.out.println("Файл не найден.");
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "Cp850"));
        writer.write(String.join("\n", data));
        reader.close();
        writer.close();
        fileOutputStream.close();
    }
}
