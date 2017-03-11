package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Stallone1", 100);
        map.put("Stallone2", 600);
        map.put("Stallone3", 200);
        map.put("Stallone4", 550);
        map.put("Stallone5", 700);
        map.put("Stallone6", 50);
        map.put("Stallone7", 10);
        map.put("Stallone8", 10000);
        map.put("Stallone9", 280);
        map.put("Stallone0", 450);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,Integer> pair = iterator.next();
            if(pair.getValue() < 500) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//
//        removeItemFromMap(map);
//
//        for(Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
    }
}