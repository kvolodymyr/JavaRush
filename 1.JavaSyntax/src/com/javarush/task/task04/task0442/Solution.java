package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int total = 0;
        for(;true;) {
            num = Integer.parseInt(reader.readLine());
            total += num;
            if (num == -1) break;
        }
        System.out.println(total);
    }
}
