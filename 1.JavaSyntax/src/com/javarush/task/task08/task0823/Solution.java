package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        boolean firstLetter = true;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
        {
            if (Character.isAlphabetic(chars[i])) {
                if(firstLetter) {
                    chars[i] = String.valueOf(chars[i]).toUpperCase().charAt(0);
                }
                firstLetter = false;
            } else {
                firstLetter = true;
            }
        }
        s = String.valueOf(chars);

        System.out.println(s);
    }
}
