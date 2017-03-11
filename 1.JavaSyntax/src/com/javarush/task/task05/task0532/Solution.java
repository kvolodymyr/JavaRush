package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        if(n <=0 ) {
            System.out.printf("N should be greater than 0");
            return;
        }
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            if(maximum < number) {
                maximum = number;
            }
        }

        System.out.println(maximum);
    }
}
