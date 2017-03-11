package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int positive = 0;
        for(int i=0; i < 3; i ++) {
            int a = Integer.parseInt(reader.readLine());
            if( a >= 0) positive++;
        }
        System.out.println(positive);

    }
}
