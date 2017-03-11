package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("MAY 1 1980"));
        map.put("Stallone4", new Date("JULY 1 1980"));
        map.put("Stallone5", new Date("OCTOBER 1 1980"));
        map.put("Stallone6", new Date("AUGUST 1 1980"));
        map.put("Stallone7", new Date("DECEMBER 1 1980"));
        map.put("Stallone8", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone9", new Date("FEBRUARY 1 1980"));
        map.put("Stallone0", new Date("JANUARY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        // Exception in thread "main" java.util.ConcurrentModificationException
//        for(String key : map.keySet()) {
//            int i = map.get(key).getMonth();
//            if(i >= 5 && i <= 7) {
//                map.remove(key);
//            }
//        }
        for(Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String,Date> pair = iterator.next();
            int i = pair.getValue().getMonth();
            if(i >= 5 && i <= 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Date> m = createMap();
//        removeAllSummerPeople(m);
//
//        for(Map.Entry<String,Date> pair : m.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
    }
}
