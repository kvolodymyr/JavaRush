package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        map.put("Stallone1", "Name1");
        map.put("Stallone2", "Name1");
        map.put("Stallone3", "Name6");
        map.put("Stallone4", "Name3");
        map.put("Stallone5", "Name2");
        map.put("Stallone6", "Name5");
        map.put("Stallone7", "Name4");
        map.put("Stallone8", "Name3");
        map.put("Stallone9", "Name8");
        map.put("Stallone0", "Name1");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            if(set.contains(pair.getValue())) {
                removeItemFromMapByValue(map, pair.getValue());
                iterator = map.entrySet().iterator();
                set = new HashSet<>();
                continue;
            }
            set.add(pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map = createMap();
//        removeTheFirstNameDuplicates(map);
//
//        for(Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
    }
}
