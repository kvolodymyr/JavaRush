package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("LName1", "FName1");
        map.put("LName1", "FName2");
        map.put("LName2", "FName4");
        map.put("LName3", "FName2");
        map.put("LName4", "FName1");
        map.put("LName1", "FName1");
        map.put("LName1", "FName2");
        map.put("LName2", "FName4");
        map.put("LName3", "FName2");
        map.put("LName4", "FName1");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
