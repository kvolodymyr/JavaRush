package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя4");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия6", "Имя5");
        map.put("Фамилия7", "Имя5");
        map.put("Фамилия8", "Имя5");
        map.put("Фамилия9", "Имя6");
        map.put("Фамилия10", "Имя7");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(String item : map.values())
        {
            if(item.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(String item : map.keySet())
        {
            if(item.equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
