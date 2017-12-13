package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(args[0]);
        int total = 0;
        while(reader.ready()){
            int code = reader.read();
            if(code > 64 && code < 91 || code > 96 && code < 123) {
                total++;
            }
        }
        reader.close();
        System.out.println(total);
    }
}
