package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] list = new int[5];
        for(int i = 0; i< 5; i++ ) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(list[i] < list[j]) {
                    int t = list[i];
                    list[i] = list[j];
                    list[j] = t;
                }
            }
        }
        for(int i = 0; i< 5; i++ ) {
            System.out.println(list[i]);
        }
    }
}
