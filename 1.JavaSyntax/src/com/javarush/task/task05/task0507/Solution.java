package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int total = 0;
        int count = 0;
        do {
            n = Integer.parseInt(reader.readLine());
            if(n != -1) {
                total += n;
                count++;
            }
        }while(n!=-1);
        System.out.println( (double)total / count);
    }
}

