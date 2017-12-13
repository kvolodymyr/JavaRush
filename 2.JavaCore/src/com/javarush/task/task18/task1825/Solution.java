package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> files = new ArrayList<String>();
        FileInputStream input = null;
        String fileName = null;
        //Читаем файлы пока не "end"
        while (true) {
            if ("end".equals(fileName = scanner.nextLine())) {
                break;
            }
            files.add(fileName);
        }
        scanner.close();

        //Сортируем коллекцию
        Collections.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        fileName = files.get(0).split(".part")[0];
        FileOutputStream output = new FileOutputStream(fileName);

        //Сливаем файлы
        for (String file : files) {
            input = new FileInputStream(file);
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            output.write(buffer);
            input.close();
        }
        output.close();
        System.out.println("Объединение файлов выполнено!");
    }
}
