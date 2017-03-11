package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 10; i++) {
            list.add(breader.readLine());
        }

        int len = list.get(0).length();
        // Вывести на экран result
        for(int i = 0; i < list.size(); i++) {
            if ( len > list.get(i).length()) {
                System.out.println(i);
                break;
            }
            len = list.get(i).length();
        }
    }
}

