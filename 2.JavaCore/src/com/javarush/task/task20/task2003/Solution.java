package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties property = new Properties();
    public static String fileName;

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        reader.close();

        FileInputStream input = new FileInputStream(fileName);
        load(input);
        input.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        property.clear();
        for (Map.Entry<String, String> pair : properties.entrySet()) {
            property.put( pair.getKey(), pair.getValue());
        }
        property.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        property.load(inputStream);
        for (Map.Entry<Object, Object> pair: property.entrySet()) {
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();

        FileOutputStream fileOutputStream = new FileOutputStream(Solution.fileName);
        solution.save(fileOutputStream);
        fileOutputStream.close();
    }
}
