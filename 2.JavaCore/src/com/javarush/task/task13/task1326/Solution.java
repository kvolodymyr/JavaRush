package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        ArrayList<Integer> list = new ArrayList<>();
        int i;
        String text;
        while (reader.ready()) {
            text = reader.readLine();
            if (text.length() == 0) continue; // fix \n\r windows issue, expect \n
            i = Integer.parseInt(text);
            if(i % 2 == 0) list.add(i);
        }
        reader.close();

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
