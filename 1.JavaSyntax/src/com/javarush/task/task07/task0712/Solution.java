package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int min = Integer.MAX_VALUE, max = 0;
        int minIndex = -1, maxIndex = -1;

        for(int i = 0; i < 10; i++) {
            list.add(breader.readLine());
            String s = list.get(i);
            if (s.length() > max) {
                max = s.length();
                maxIndex = i;
            }
            if (s.length() < min) {
                min = s.length();
                minIndex = i;
            }
        }
        if(minIndex <= maxIndex) {
            System.out.println(list.get(minIndex));
        } else {
            System.out.println(list.get(maxIndex));
        }
    }
}
