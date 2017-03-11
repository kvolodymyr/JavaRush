package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < abcArray.length; i++) map.put(abcArray[i], 0);
        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            for(int j = 0; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                }
            }
        }
        for(int i = 0; i < abcArray.length; i++)
        {
            System.out.println(abcArray[i] + " " + map.get(abcArray[i]));
        }

    }

}
