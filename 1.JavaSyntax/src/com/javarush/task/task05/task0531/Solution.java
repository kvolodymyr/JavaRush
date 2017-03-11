package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

/*        int minimum = 0;
        for(int i = 0 ; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            if(i == 0) minimum = number;
            minimum = min(minimum, number);
        }*/
        int minimum = min(
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()));

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int number1, int number2, int number3, int number4, int number5) {
        int minimum = min(number1, number2);
        minimum = min(minimum, number3);
        minimum = min(minimum, number4);
        return min(minimum, number5);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
