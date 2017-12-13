package com.javarush.task.task18.task1804;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        File file = new File(fileName);
        InputStream stream = new FileInputStream(file);
        long length = file.length();
        byte[] bytes = new byte[(int) length];

        stream.read(bytes);
        stream.close();
        HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
        Integer min = Integer.MAX_VALUE;
        for(int i = 0; i < bytes.length; i++) {
            if (!map.containsKey(bytes[i])) {
                map.put(bytes[i], 0);
            }
            int repeat = map.get(bytes[i]) +  1;
            map.put(bytes[i], repeat);
            if (min > repeat) {
                min = repeat;
            }
        }
        for(Byte k: map.keySet()) {
            if(map.get(k) == min) {
                System.out.print(String.valueOf(k) + " ");
            }
        }
    }
}
