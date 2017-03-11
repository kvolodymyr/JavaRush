package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] string = reader.readLine().toCharArray();
        ArrayList<String> vowel = new ArrayList<>();
        ArrayList<String> consonant = new ArrayList<>();
        for(char c : string) {
            String s = String.valueOf(c);
            if (s.startsWith(" ")) continue;
            if(isVowel(c)) {
                vowel.add(s);
            } else {
                consonant.add(s);
            }
        }
        for(String c : vowel) System.out.print(c + " ");
        System.out.println();
        for(String c : consonant) System.out.print(c + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}