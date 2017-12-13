package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    static TreeMap<String, Double> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        String filename = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        while (reader.ready()) {
            String[] data = reader.readLine().split(" ");
            addMap(data[0], Double.parseDouble(data[1]));
        }
        reader.close();

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }

    private static void addMap(String name, Double value) {
        if (!map.containsKey(name)) {
            map.put(name, value);
        } else {
            map.put(name, map.get(name) + value);
        }
    }
}
