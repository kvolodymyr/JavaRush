package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int maxEven = 0, maxOdd = 0;
        for(int i = 0; i < 15; i++) {
            list[i] = Integer.parseInt(breader.readLine());
            if(i %2 == 0) {
                maxEven += list[i];
            } else {
                maxOdd += list[i];
            }
        }
        if(maxEven >= maxOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
