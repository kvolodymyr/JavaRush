package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for(int i = list.length - 1; i >= 0; i--) {
            list[i] = Integer.parseInt(breader.readLine());
        }
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

